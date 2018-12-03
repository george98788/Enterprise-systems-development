/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Jdbc;
import model.UserObject;

/**
 *
 * @author saphi
 */
public class CustomerRequestServlet extends HttpServlet {

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
        HttpSession session = request.getSession();
        response.setContentType("text/html;charset=UTF-8");
        Jdbc dbBean = new Jdbc();
        dbBean.connect((Connection) request.getServletContext().getAttribute("connection"));
        session.setAttribute("dbbean", dbBean);
        Jdbc jdbc = (Jdbc) session.getAttribute("dbbean");
        UserObject userObject = (UserObject) session.getAttribute("user");
//        session.setAttribute("user", userObject);
        String userName = userObject.getUsername();
        String[] demandsquery = new String[6];
//        demandsquery[0] = (String) request.getParameter("user");
        demandsquery[0] = userName;
        demandsquery[1] = (String) request.getParameter("pickUpAdd");
        demandsquery[2] = (String) request.getParameter("destination");
        demandsquery[3] = (String) request.getParameter("demands_date");
        demandsquery[4] = (String) request.getParameter("demands_time");
        demandsquery[5] = (String) request.getParameter("status");
        
        if (jdbc == null) {
            request.getRequestDispatcher("/WEB-INF/conErr.jsp").forward(request, response);
        }else{
            
            jdbc.requestCab(demandsquery); 
            request.getRequestDispatcher("/requestCab.jsp").forward(request, response);
        }
        request.getRequestDispatcher("/requestCab.jsp").forward(request, response);
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
