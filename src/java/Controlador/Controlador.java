/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Empleado;
import ModeloDAO.EmpleadoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static jdk.nashorn.internal.runtime.Debug.id;

/**
 *
 * @author idrzI
 */
public class Controlador extends HttpServlet {
    String listar="vistas/listar.jsp";
    String add="vistas/add.jsp";
    String edit="vistas/edit.jsp";
    Empleado e=new Empleado();
    EmpleadoDAO dao=new EmpleadoDAO();
    int id;
 

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso="";
        String action=request.getParameter("accion");
        if(action.equalsIgnoreCase("listar")){
            acceso=listar;
        }else if(action.equalsIgnoreCase("add")){
            acceso=add;
        }
        else if(action.equalsIgnoreCase("Agregar")){
            String nom=request.getParameter("txtNom");
            String ape=request.getParameter("txtApell");
            String ced=request.getParameter("txtCed");
            String sex=request.getParameter("cbSex");
            String estcivil=request.getParameter("cbEstadoCivil");
            String pro=request.getParameter("cbProfesion");
            String nac=request.getParameter("cbNacionalidad");
            String fnac=request.getParameter("txtFecNac");
            String fing=request.getParameter("txtFecIng");
            String mail=request.getParameter("txtEmail");
            
            e.setV_nombre(nom);
            e.setV_apellido(ape);
            e.setV_identificacion(ced);
            e.setV_sexo(sex);
            e.setV_estado_civil(estcivil);
            e.setV_profesion(pro);
            e.setV_nacionalidad(nac);
            e.setV_fec_nacimiento(fnac);
            e.setV_fec_ingreso(fing);
            e.setV_email(mail);
            
            dao.add(e);
            
            acceso=listar;
            
        }else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("idemp", request.getParameter("id"));
            acceso=edit;
        }
        else if(action.equalsIgnoreCase("Actualizar")){
            
            id=Integer.parseInt(request.getParameter("txtid"));
            
            String nom=request.getParameter("txtNom");
            String ape=request.getParameter("txtApell");
            String ced=request.getParameter("txtCed");
            String sex=request.getParameter("cbSex");
            String estcivil=request.getParameter("cbEstadoCivil");
            String pro=request.getParameter("cbProfesion");
            String nac=request.getParameter("cbNacionalidad");
            String fnac=request.getParameter("txtFecNac");
            String fing=request.getParameter("txtFecIng");
            String mail=request.getParameter("txtEmail");
            
            e.setV_id(id);
            
            e.setV_nombre(nom);
            e.setV_apellido(ape);
            e.setV_identificacion(ced);
            e.setV_sexo(sex);
            e.setV_estado_civil(estcivil);
            e.setV_profesion(pro);
            e.setV_nacionalidad(nac);
            e.setV_fec_nacimiento(fnac);
            e.setV_fec_ingreso(fing);
            e.setV_email(mail);
            
            dao.edit(e);
            acceso=listar;
        }else if(action.equalsIgnoreCase("eliminar")){
            id = Integer.parseInt(request.getParameter("id"));
            e.setV_id(id);
            dao.eliminar(id);
            acceso=listar;
        }
        
        RequestDispatcher vista=request.getRequestDispatcher(acceso);
        vista.forward(request, response);
        
        
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
