/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miempresa.controller;

import com.miempresa.dao.PreguntaDao;
import com.miempresa.daos.LoginDAO;
import com.miempresa.dtos.PreguntaDto;
import com.miempresa.dtos.UsuarioDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lenovo1
 */
public class ControlLogin extends HttpServlet {

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
        String correo = request.getParameter("txtCorreo");
        String clave = request.getParameter("txtClave");
        //String accion = request.getParameter("txtAccionp");

        UsuarioDTO usuario = new UsuarioDTO(correo, clave);
        LoginDAO login = new LoginDAO();
        UsuarioDTO preguntas = login.sql_selectByU(correo);
        if (login.validarUsuario(usuario)) {

            //request.getSession().setAttribute("preguntas", preguntas);
            request.getSession().setAttribute("usuario", usuario);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } else {
            String error = "Usuario y/o contraseña incorrecta";
            request.getSession().setAttribute("error", error);
            request.getRequestDispatcher("error_1.jsp").forward(request, response);
        }
//        if (accion.equals("inicio")) {
//            request.getSession().setAttribute("preguntas", preguntas);
//            request.getRequestDispatcher("index.jsp").forward(request, response);
//        }
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
        processRequest(request, response);
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
