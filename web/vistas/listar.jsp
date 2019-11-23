<%-- 
    Document   : listar
    Created on : 12-nov-2019, 22:26:26
    Author     : idrzI
--%>

<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Empleado"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.EmpleadoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h1>Empleados</h1>
            <a class="btn btn-success"  href="Controlador?accion=add" >Agregar Nuevo</a>
            <br>
            <table class="table" >
                <thead>
                    <tr>
                        <th class="text-center" >ID</th>
                        <th class="text-center">Nombres</th>
                        <th class="text-center">Apellidos</th>
                        <th class="text-center">Cedula</th>
                        <th class="text-center">Profesion</th>
                        <th class="text-center">Acciones</th>
                        
                    </tr>
                </thead>
                
                <%
                    
                    EmpleadoDAO dao = new EmpleadoDAO();
                    List<Empleado> list = dao.listar();
                    Iterator<Empleado> iter = list.iterator();
                    Empleado emp = null;
                    
                    while(iter.hasNext()){
                        emp = iter.next();
                    
                %>
                
                <tbody>
                    <tr>
                        <td class="text-center"> <%= emp.getV_id()%> </td>
                        <td class="text-center"><%= emp.getV_nombre()%></td>
                        <td class="text-center"><%= emp.getV_apellido() %></td>
                        <td class="text-center"><%= emp.getV_identificacion() %></td>
                        <td class="text-center"><%= emp.getV_profesion() %></td>
                        <td class="text-center">
                            <a class="btn btn-warning" href="Controlador?accion=editar&id=<%= emp.getV_id()%>" >Editar</a>
                            <a class="btn btn-danger" href="Controlador?accion=eliminar&id=<%= emp.getV_id()%>">Eliminar</a>
                        </td>
                    </tr>            
                    <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>
