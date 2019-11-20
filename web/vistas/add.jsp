<%-- 
    Document   : add
    Created on : 12-nov-2019, 22:26:38
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
        <h1>Agregar Empleado</h1>
        <form action="Controlador">
            Nombres:<br>
            <input type="text" name="txtNom" required><br>
            Apellidos:<br>
            <input type="text" name="txtApell" required><br>
            Cedula:<br>
            <input type="text" name="txtCed" required><br>
            Sexo:<br>
            <select name="cbSex" required>
                <option value="M">Masculino</option>
                <option value="F">Femenino</option>
            </select><br>
            Estado Civil:<br>
            <select name="cbEstadoCivil" required>
                <option value="Soltero">Soltero</option>
                <option value="Casado">Casado</option>
            </select><br>
            Profesion:<br>
            <select name="cbProfesion" required>
                <option value="Informatico">Informatico</option>
                <option value="Contador">Contador</option>
            </select><br>
            Nacionalidad:<br>
            <select name="cbNacionalidad" required>
                <option value="Nicaragua">Nicaragua</option>
                <option value="Costa Rica">Costa Rica</option>
                <option value="Guatemala">Guatemala</option>
                <option value="Belice">Belice</option>
                <option value="Honduras">Honduras</option>
                <option value="El Salvador">El Salvador</option>
            </select><br>
            Fecha de nacimiento:<br>
            <input type="date" name="txtFecNac" required><br>
            Fecha de ingreso:<br>
            <input type="date" name="txtFecIng" required><br>
            Correo Empresarial:<br>
            <input type="email" name="txtEmail" required>
            <input type="submit" name="accion" value="Agregar" ><br>
        </form>
            
    </body>
</html>
