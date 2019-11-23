/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD;
import Modelo.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author idrzI
 */
public class EmpleadoDAO implements CRUD {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Empleado emp = new Empleado();
    
    

    @Override
    public List listar() {
        ArrayList<Empleado> list = new ArrayList<>();
        String sql = "select * from empleados";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while( rs.next() ){
                Empleado w_emp = new Empleado();
                w_emp.setV_id(rs.getInt("ID_EMPLEADO"));
                w_emp.setV_nombre(rs.getString("NOMBRE"));
                w_emp.setV_apellido(rs.getString("APELLIDO"));
                w_emp.setV_identificacion(rs.getString("IDENTIFICACION"));
                w_emp.setV_profesion(rs.getString("PROFESION"));
                
                list.add(w_emp);
            }
            
        } catch (Exception e){
            
        }
        return list;
        
    }

    public Empleado list(int id) {
        String sql = "select * from empleados where ID_EMPLEADO="+id;
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while( rs.next() ){
                
                emp.setV_id(rs.getInt("ID_EMPLEADO"));
                emp.setV_nombre(rs.getString("NOMBRE"));
                emp.setV_apellido(rs.getString("APELLIDO"));
                emp.setV_identificacion(rs.getString("IDENTIFICACION"));
                emp.setV_profesion(rs.getString("PROFESION"));
                
            }
            
        } catch (Exception e){
            
        }
        return emp;
    }

    @Override
    public boolean add(Empleado emp) {
        String sql = "INSERT INTO `empleados` (`NOMBRE`, `APELLIDO`, `IDENTIFICACION`, `SEXO`, `ESTADO_CIVIL`, `PROFESION`, `NACIONALIDAD`, `FEC_NACIMIENTO`, `FEHCA_INGRESO`, `MAIL_EMPRESA`) VALUES ('"+emp.getV_nombre()+"','"+emp.getV_apellido()+"','"+emp.getV_identificacion()+"','"+emp.getV_sexo()+"','"+emp.getV_estado_civil()+"','"+emp.getV_profesion()+"','"+emp.getV_nacionalidad()+"','"+emp.getV_fec_nacimiento()+"','"+emp.getV_fec_ingreso()+"','"+emp.getV_email()+"')" ;
        try{
           con=cn.getConnection();
           ps=con.prepareStatement(sql);
           ps.executeUpdate();
        } catch (Exception e) {
            
        }
        
        return false;
    }

    @Override
    public boolean edit(Empleado emp) {
        String sql = "UPDATE empleados SET NOMBRE='"+emp.getV_nombre()+"',APELLIDO='"+emp.getV_apellido()+"',IDENTIFICACION='"+emp.getV_identificacion()+"',SEXO='"+emp.getV_sexo()+"',ESTADO_CIVIL='"+emp.getV_estado_civil()+"',PROFESION='"+emp.getV_profesion()+"',NACIONALIDAD='"+emp.getV_nacionalidad()+"',FEC_NACIMIENTO='"+emp.getV_fec_nacimiento()+"',FEHCA_INGRESO='"+emp.getV_fec_ingreso()+"',MAIL_EMPRESA'"+emp.getV_email()+"'WHERE ID_EMPLEADO="+emp.getV_id();
        
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
        }catch(Exception e){
            
        }
        
        
        return false;
        
    }

    @Override
    public boolean eliminar(int id) {
        String sql="delete from persona where ID_EMPLEADO="+id;
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch(Exception e){
            
        }
        return false;
    }

    @Override
    public Empleado list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
