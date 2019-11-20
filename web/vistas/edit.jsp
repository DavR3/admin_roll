<%-- 
    Document   : edit
    Created on : 12-nov-2019, 22:26:50
    Author     : idrzI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
        <h1>Modificar Empleado</h1>
        <form action="Controlador">
            Nombres:<br>
            <input type="text" name="txtNom" value="" required><br>
            Apellidos:<br>
            <input type="text" name="txtApell" value="" required><br>
            Cedula:<br>
            <input type="text" name="txtCed" value="" required><br>
            Sexo:<br>
            <select name="cbSex" value="" required>
                <option value="M">Masculino</option>
                <option value="F">Femenino</option>
            </select><br>
            Estado Civil:<br>
            <select name="cbEstadoCivil" value="" required>
                <option value="Soltero">Soltero</option>
                <option value="Casado">Casado</option>
            </select><br>
            Profesion:<br>
            <select name="cbProfesion" value="" required>
                <option value="Informatico">Informatico</option>
                <option value="Contador">Contador</option>
            </select><br>
            Nacionalidad:<br>
            <select name="cbNacionalidad" value="" required>
                <option value="Nicaragua">Nicaragua</option>
                <option value="Costa Rica">Costa Rica</option>
                <option value="Guatemala">Guatemala</option>
                <option value="Belice">Belice</option>
                <option value="Honduras">Honduras</option>
                <option value="El Salvador">El Salvador</option>
            </select><br>
            Fecha de nacimiento:<br>
            <input type="date" name="txtFecNac" value="" required><br>
            Fecha de ingreso:<br>
            <input type="date" name="txtFecIng" value="" required><br>
            Correo Empresarial:<br>
            <input type="email" name="txtEmail" value="" required>
            <input type="hidden" name="txtid" value="" >
            <input type="submit" name="accion" value="Actualizar" ><br>
            <a href="Controlador?accion=listar" >Regresar</a>
        </form>
        
        
        
        
    </body>
</html>
