/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author idrzI
 */
public class Empleado {
    int v_id;
    String v_nombre;
    String v_apellido;
    String v_identificacion;
    String v_sexo;
    String v_estado_civil;
    String v_profesion;
    String v_nacionalidad;
    String v_fec_nacimiento;
    String v_fec_ingreso;
    String v_fec_salida;
    String v_email;

    public Empleado(int v_id, String v_nombre, String v_apellido, String v_identificacion, String v_sexo, String v_estado_civil, String v_profesion, String v_nacionalidad, String v_fec_nacimiento, String v_fec_ingreso, String v_fec_salida, String v_email) {
        this.v_id = v_id;
        this.v_nombre = v_nombre;
        this.v_apellido = v_apellido;
        this.v_identificacion = v_identificacion;
        this.v_sexo = v_sexo;
        this.v_estado_civil = v_estado_civil;
        this.v_profesion = v_profesion;
        this.v_nacionalidad = v_nacionalidad;
        this.v_fec_nacimiento = v_fec_nacimiento;
        this.v_fec_ingreso = v_fec_ingreso;
        this.v_fec_salida = v_fec_salida;
        this.v_email = v_email;
    }

    public String getV_sexo() {
        return v_sexo;
    }

    public void setV_sexo(String v_sexo) {
        this.v_sexo = v_sexo;
    }

    public String getV_estado_civil() {
        return v_estado_civil;
    }

    public void setV_estado_civil(String v_estado_civil) {
        this.v_estado_civil = v_estado_civil;
    }

    public String getV_nacionalidad() {
        return v_nacionalidad;
    }

    public void setV_nacionalidad(String v_nacionalidad) {
        this.v_nacionalidad = v_nacionalidad;
    }

    public String getV_fec_nacimiento() {
        return v_fec_nacimiento;
    }

    public void setV_fec_nacimiento(String v_fec_nacimiento) {
        this.v_fec_nacimiento = v_fec_nacimiento;
    }

    public String getV_fec_ingreso() {
        return v_fec_ingreso;
    }

    public void setV_fec_ingreso(String v_fec_ingreso) {
        this.v_fec_ingreso = v_fec_ingreso;
    }

    public String getV_fec_salida() {
        return v_fec_salida;
    }

    public void setV_fec_salida(String v_fec_salida) {
        this.v_fec_salida = v_fec_salida;
    }

    public String getV_email() {
        return v_email;
    }

    public void setV_email(String v_email) {
        this.v_email = v_email;
    }
    

    public Empleado() {
    }

   /* public Empleado(int v_id, String v_nombre, String v_apellido, String v_identificacion, String v_profesion) {
        this.v_id = v_id;
        this.v_nombre = v_nombre;
        this.v_apellido = v_apellido;
        this.v_identificacion = v_identificacion;
        this.v_profesion = v_profesion;
    }
*/
    public int getV_id() {
        return v_id;
    }

    public void setV_id(int v_id) {
        this.v_id = v_id;
    }
    
    
    public String getV_nombre() {
        return v_nombre;
    }

    public void setV_nombre(String v_nombre) {
        this.v_nombre = v_nombre;
    }

    public String getV_apellido() {
        return v_apellido;
    }

    public void setV_apellido(String v_apellido) {
        this.v_apellido = v_apellido;
    }

    public String getV_identificacion() {
        return v_identificacion;
    }

    public void setV_identificacion(String v_identificacion) {
        this.v_identificacion = v_identificacion;
    }

    public String getV_profesion() {
        return v_profesion;
    }

    public void setV_profesion(String v_profesion) {
        this.v_profesion = v_profesion;
    }
    
}
