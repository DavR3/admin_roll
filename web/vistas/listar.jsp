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
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>Empleados</h1>
            <a href="Controlador?accion=add" >Agregar Nuevo</a>
            <table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nombres</th>
                        <th>Apellidos</th>
                        <th>Cedula</th>
                        <th>Profesion</th>
                        <th>Acciones</th>
                        
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
                        <td> <%= emp.getV_id()%> </td>
                        <td><%= emp.getV_nombre()%></td>
                        <td><%= emp.getV_apellido() %></td>
                        <td><%= emp.getV_identificacion() %></td>
                        <td><%= emp.getV_profesion() %></td>
                        <td>
                            <a href="Controlador?accion=editar&id=<%= emp.getV_id()%>" >Editar</a>
                            <a>Eliminar</a>
                        </td>
                    </tr>            
                    <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>
