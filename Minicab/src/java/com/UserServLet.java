/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
//import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Jdbc;

/**
 *
 * @author me-aydin
 */
public class UserServLet extends HttpServlet {

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
        String qry = "SELECT ID, USERNAME, ROLES FROM USERS";
        HttpSession session = request.getSession(); 
        response.setContentType("text/html;charset=UTF-8");
        
        Jdbc dbBean = new Jdbc();
        dbBean.connect((Connection)request.getServletContext().getAttribute("connection"));
        session.setAttribute("dbbean", dbBean);

        String allocationquery = "SELECT ID, CUSTOMER_NAME,DESTINATION, "
                + "DEMANDS_DATE,DEMANDS_TIME, STATUS from DEMANDS";
        String driverAvailable ="SELECT NAME from DRIVERS";
        if((Connection)request.getServletContext().getAttribute("connection")==null){
            request.getRequestDispatcher("/WEB-INF/conErr.jsp").forward(request, response);
        }
            
        if (request.getParameter("tbl").equals("List")){
            String msg="No users";
            try {
                msg = dbBean.tblretrieve(qry);
            } catch (SQLException ex) {
                Logger.getLogger(UserServLet.class.getName()).log(Level.SEVERE, null, ex);
            }
            request.setAttribute("query", msg);
            request.getRequestDispatcher("/WEB-INF/results.jsp").forward(request, response);
        }
        else if(request.getParameter("tbl").equals("NewUser")){
//            request.getRequestDispatcher("/WEB-INF/user.jsp").forward(request, response);
              request.getRequestDispatcher("/register.jsp").forward(request, response);
        } 
        else if(request.getParameter("tbl").equals("NewDriver")){
            
//            String newDriver = "newDriver";
//            request.setAttribute("newDriver", newDriver);
            request.getRequestDispatcher("/driverRegister.jsp").forward(request, response);
        } 
        else if(request.getParameter("tbl").equals("Update")){
            request.getRequestDispatcher("/WEB-INF/passwdChange.jsp").forward(request, response);    
        }
         else if(request.getParameter("tbl").equals("Turnover")){
            request.getRequestDispatcher("turnover.jsp").forward(request, response);    
        }
        else if(request.getParameter("tbl").equals("Modify")){
            request.getRequestDispatcher("/modify.jsp").forward(request, response);
        } 
        else if(request.getParameter("tbl").equals("Allocation")){
            String allocationMsg = "No allocation available";
            String driverAvailMsg = "No drivers available";
            try {
                allocationMsg = dbBean.assignretrieve(allocationquery);
                driverAvailMsg=dbBean.driverretrieve(driverAvailable);
            } catch (SQLException ex) {
                Logger.getLogger(UserServLet.class.getName()).log(Level.SEVERE, null, ex);
            }
            request.setAttribute("allocationquery", allocationMsg);
            request.setAttribute("driverAvailable", driverAvailMsg);
            request.getRequestDispatcher("/allocation.jsp").forward(request, response);
        } 
        else {
            request.setAttribute("msg", "del");
            request.getRequestDispatcher("/WEB-INF/user.jsp").forward(request, response); 
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
