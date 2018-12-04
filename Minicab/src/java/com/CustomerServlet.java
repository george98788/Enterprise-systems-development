/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
            throws ServletException, IOException, ParseException {

        HttpSession session = request.getSession(false);
        response.setContentType("text/html;charset=UTF-8");
        Jdbc dbBean = new Jdbc();
        dbBean.connect((Connection) request.getServletContext().getAttribute("connection"));
        session.setAttribute("dbbean", dbBean);
        UserObject userObject = (UserObject) session.getAttribute("user");
        Jdbc jdbc = (Jdbc) session.getAttribute("dbbean");
        
        String userName = userObject.getUsername();

        String customerDetailsqry="SELECT USERS.ID,USERS.USERNAME,CUSTOMERS.ID, "
                + "CUSTOMERS.\"NAME\",CUSTOMERS.EMAIL, CUSTOMERS.ADDRESS"
                + " from (USERS INNER JOIN CUSTOMERS On "
                + "Users.ID = Customers.USER_ID) where USERS.USERNAME='"+userName+"'";
       
        String customerDemands="SELECT * FROM DEMANDS where CUSTOMER_ID ="
                + "(SELECT ID FROM CUSTOMERS WHERE USER_ID=(SELECT ID FROM USERS WHERE USERNAME='"+userName+"'))";

        
        if ((Connection) request.getServletContext().getAttribute("connection") == null) {
            request.getRequestDispatcher("/WEB-INF/conErr.jsp").forward(request, response);
        }
        if (request.getParameter("tbl").equals("RequestCab")) { //insert into demands
//            jdbc.requestCab(demandsquery);
            request.getRequestDispatcher("requestCab.jsp").forward(request, response);
        } 
        else if (request.getParameter("tbl").equals("Update")) {
            request.getRequestDispatcher("/WEB-INF/passwdChange.jsp").forward(request, response);
        } 
        else if (request.getParameter("tbl").equals("UserDetails")) {
            String msg="No Customer";
            String customerdemandsmsg="No receipts";
            try {
//                msg = dbBean.retrieve(customerDetailsqry);
                msg = dbBean.retrieve(customerDetailsqry);
                
                customerdemandsmsg = dbBean.retrieve(customerDemands);
            } catch (SQLException ex) {
                Logger.getLogger(UserServLet.class.getName()).log(Level.SEVERE, null, ex);
            }
            request.setAttribute("customerDetailsqry", msg);
            request.setAttribute("customerDemands",customerdemandsmsg);
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(CustomerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(CustomerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
