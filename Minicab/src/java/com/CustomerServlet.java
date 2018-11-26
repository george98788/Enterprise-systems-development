/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.CustomerObject;
import model.Jdbc;
import model.UserObject;

/**
 *
 * @author georg
 */
public class CustomerServlet extends HttpServlet {

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

        HttpSession session = request.getSession(false);
        response.setContentType("text/html;charset=UTF-8");
        Jdbc dbBean = new Jdbc();
        dbBean.connect((Connection) request.getServletContext().getAttribute("connection"));
        session.setAttribute("dbbean", dbBean);
        UserObject userObject = (UserObject) session.getAttribute("user");
        Jdbc jdbc = (Jdbc) session.getAttribute("dbbean");
        
        String[] demandsquery = new String[8];
        demandsquery[0] = (String) request.getParameter("user");
        demandsquery[1] = (String) request.getParameter("pickUpAdd");
        demandsquery[2] = (String) request.getParameter("destination");
        demandsquery[3] = (String) request.getParameter("date");
        demandsquery[4] = (String) request.getParameter("time");
        demandsquery[5] = (String) request.getParameter("status");
        String userName = userObject.getUsername();

        String customerDetailsqry="SELECT USERS.ID,USERS.USERNAME,CUSTOMERS.*"
                + " from (USERS INNER JOIN CUSTOMERS On "
                + "Users.ID = Customers.USER_ID) where USERS.USERNAME='"+userName+"'";
         
        if ((Connection) request.getServletContext().getAttribute("connection") == null) {
            request.getRequestDispatcher("/WEB-INF/conErr.jsp").forward(request, response);
        }
        if (request.getParameter("tbl").equals("RequestCab")) { //insert into demands
            jdbc.requestCab(demandsquery);
      
            request.getRequestDispatcher("requestCab.jsp").forward(request, response);
        } 
        else if (request.getParameter("tbl").equals("Update")) {
            request.getRequestDispatcher("/WEB-INF/passwdChange.jsp").forward(request, response);
        } 
        else if (request.getParameter("tbl").equals("UserDetails")) {
            String msg="No Customer";
            try {
                msg = dbBean.retrieve(customerDetailsqry);
            } catch (SQLException ex) {
                Logger.getLogger(UserServLet.class.getName()).log(Level.SEVERE, null, ex);
            }
            request.setAttribute("customerDetailsqry", msg);
            request.getRequestDispatcher("customerDetails.jsp").forward(request, response);
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
