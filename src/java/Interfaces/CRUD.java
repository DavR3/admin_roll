/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.Empleado;
import java.util.List;

/**
 *
 * @author idrzI
 */
public interface CRUD {
    public List listar();
    public Empleado list();
    public boolean add(Empleado emp);
    public boolean edit(Empleado emp);
    public boolean eliminar(int id);
    
}
