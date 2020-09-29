/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miempresa.controller;

import com.miempresa.dao.PreguntaDao;
import com.miempresa.dtos.PreguntaDto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lenovo1
 */
public class PreguntaController extends HttpServlet {

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
        String accion = request.getParameter("txtAccionp");

        if (accion.equals("listp")) {
            PreguntaDao preguntaDao = new PreguntaDao();
            ArrayList<PreguntaDto> preguntas = preguntaDao.sql_selectAll();
            request.getSession().setAttribute("preguntas", preguntas);
            request.getRequestDispatcher("mproductos/listapreguntas.jsp").forward(request, response);
        } else if (accion.equals("newp")) {
            String anio = request.getParameter("txtAnio");
            String bimestre = request.getParameter("txtBimestre");
            String curso = request.getParameter("txtCurso");
            String dificultad = request.getParameter("txtDificultad");
            String pregunta = request.getParameter("txtPregunta");
            PreguntaDto preguntaDto = new PreguntaDto(anio, bimestre, curso, dificultad, pregunta);
            PreguntaDao preguntaDao = new PreguntaDao();
            preguntaDao.sql_insert(preguntaDto);
            ArrayList<PreguntaDto> preguntas = preguntaDao.sql_selectAll();
            request.getSession().setAttribute("preguntas", preguntas);
            request.getRequestDispatcher("mproductos/newpreguntas.jsp").forward(request, response);
        } else if (accion.equals("updatep")) {
            int id = Integer.parseInt(request.getParameter("id"));
            PreguntaDao preguntaDao = new PreguntaDao();
            PreguntaDto preguntas = preguntaDao.sql_selectById(id);
            request.getSession().setAttribute("preguntas", preguntas);
            request.getRequestDispatcher("mproductos/updatepreguntas.jsp").forward(request, response);

        } else if (accion.equals("inicio")) {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } else if (accion.equals("deletep")) {
            int id = Integer.parseInt(request.getParameter("id"));
            PreguntaDao reguntaDao = new PreguntaDao();
            PreguntaDao preguntaDao = new PreguntaDao();
            reguntaDao.sql_deletePC(id);
            preguntaDao.sql_delete(id);
            ArrayList<PreguntaDto> preguntas = preguntaDao.sql_selectAll();
            request.getSession().setAttribute("preguntas", preguntas);
            request.getRequestDispatcher("mproductos/listRPD.jsp").forward(request, response);
        } else if (accion.equals("editar")) {
            PreguntaDao preguntaDao = new PreguntaDao();
            ArrayList<PreguntaDto> preguntas = preguntaDao.sql_selectAll();
            request.getSession().setAttribute("preguntas", preguntas);
            request.getRequestDispatcher("mproductos/listRPU.jsp").forward(request, response);
        } else if (accion.equals("eliminar")) {
            PreguntaDao preguntaDao = new PreguntaDao();
            ArrayList<PreguntaDto> preguntas = preguntaDao.sql_selectAll();
            request.getSession().setAttribute("preguntas", preguntas);
            request.getRequestDispatcher("mproductos/listRPD.jsp").forward(request, response);
        } else if (accion.equals("seleccionar")) {
            int id = Integer.parseInt(request.getParameter("id"));
            PreguntaDao preguntaDao = new PreguntaDao();
            PreguntaDto preguntas = preguntaDao.sql_selectById(id);
            request.getSession().setAttribute("preguntas", preguntas);
            request.getRequestDispatcher("mproductos/selecPreg.jsp").forward(request, response);

        } else if (accion.equals("Buscar")) {
            String dato = request.getParameter("txtBusca");
            PreguntaDao dao = new PreguntaDao();
            List<PreguntaDto> lista = dao.buscar(dato);
            request.getSession().setAttribute("preguntas", lista);
            request.getRequestDispatcher("../mproductos/listapreguntas.jsp").forward(request, response);

        } else if (accion.equals("modificar")) {
            int id = Integer.parseInt(request.getParameter("txtId"));
            String anio = request.getParameter("txtAnio");
            String bimestre = request.getParameter("txtBimestre");
            String curso = request.getParameter("txtCurso");
            String dificultad = request.getParameter("txtDificultad");
            String pregunta = request.getParameter("txtPregunta");
            PreguntaDao preguntaDao = new PreguntaDao();
            PreguntaDto preguntaDto = new PreguntaDto(anio, bimestre, curso, dificultad, pregunta, id);
            preguntaDao.sql_update(preguntaDto);
            ArrayList<PreguntaDto> preguntas = preguntaDao.sql_selectAll();
            request.getSession().setAttribute("preguntas", preguntas);
            request.getRequestDispatcher("mproductos/listRPU.jsp").forward(request, response);
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
