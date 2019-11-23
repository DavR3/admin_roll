<%-- 
    Document   : edit
    Created on : 12-nov-2019, 22:26:50
    Author     : idrzI
    porque autor
--%>

<%@page import="Modelo.Empleado"%>
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
            <div class="col-lg-7">
                 <%
            EmpleadoDAO dao = new EmpleadoDAO();
            int id = Integer.parseInt((String) request.getAttribute("idemp") );
            Empleado e =(Empleado)dao.list(id);
        %>
        
        <h1>Modificar Empleado</h1>
        <form action="Controlador">
            Nombres:<br>
            <input class="form-control" type="text" name="txtNom" value="<%= e.getV_nombre() %>" required><br>
            Apellidos:<br>
            <input class="form-control" type="text" name="txtApell" value="<%= e.getV_apellido() %>" required><br>
            Cedula:<br>
            <input class="form-control" type="text" name="txtCed" value="<%= e.getV_identificacion() %>" required><br>
            Sexo:<br>
            <select class="form-control"  name="cbSex" value="<%= e.getV_sexo() %>" required>
                <option value="M">Masculino</option>
                <option value="F">Femenino</option>
            </select><br>
            Estado Civil:<br>
            <select class="form-control" name="cbEstadoCivil" value="<%= e.getV_estado_civil() %>" required>
                <option value="Soltero">Soltero</option>
                <option value="Casado">Casado</option>
            </select><br>
            Profesion:<br>
            <select class="form-control" name="cbProfesion" value="<%= e.getV_profesion() %>" required>
                <option value="Informatico">Informatico</option>
                <option value="Contador">Contador</option>
            </select><br>
            Nacionalidad:<br>
            <select class="form-control" name="cbNacionalidad" value="<%= e.getV_nacionalidad() %>" required>
                <option value="Nicaragua">Nicaragua</option>
                <option value="Costa Rica">Costa Rica</option>
                <option value="Guatemala">Guatemala</option>
                <option value="Belice">Belice</option>
                <option value="Honduras">Honduras</option>
                <option value="El Salvador">El Salvador</option>
            </select><br>
            Fecha de nacimiento:<br>
            <input class="form-control" type="date" name="txtFecNac" value="<%= e.getV_fec_nacimiento() %>" required><br>
            Fecha de ingreso:<br>
            <input class="form-control" type="date" name="txtFecIng" value="<%= e.getV_fec_ingreso() %>" required><br>
            Correo Empresarial:<br>
            <input class="form-control" type="email" name="txtEmail" value="<%= e.getV_email() %>" required>
            <input type="hidden" name="txtid" value="<%= e.getV_id() %>" >
            <input class="btn btn-primary" type="submit" name="accion" value="Actualizar" ><br>
            <a href="Controlador?accion=listar" >Regresar</a>
        </form>
        
        
        
        
            </div>
        </div>
       
    </body>
</html>
