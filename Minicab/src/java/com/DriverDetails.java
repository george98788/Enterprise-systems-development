/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.UserServLet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class DriverDetails extends HttpServlet {

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
        HttpSession session = request.getSession();
        Jdbc dbBean = new Jdbc();
        dbBean.connect((Connection) request.getServletContext().getAttribute("connection"));
        session.setAttribute("dbbean", dbBean);
        UserObject userObject = (UserObject) session.getAttribute("user");
        Jdbc jdbc = (Jdbc) session.getAttribute("dbbean");
        String userName = userObject.getUsername();
        
        String journeyqry = "SELECT USERS.ID,USERS.USERNAME,DRIVERS.*,JOURNEYS.* FROM "
                + "(USERS INNER JOIN DRIVERS ON "
                + "USERS.ID=DRIVERS.USERS_ID)" +
                "LEFT OUTER JOIN JOURNEYS ON DRIVERS.ID = JOURNEYS.DRIVERS_ID "
                + "WHERE USERS.USERNAME='"+userName+"'";
        

        String driverDetailsqry="SELECT USERS.ID,USERS.USERNAME, DRIVERS.*"
                + " from (USERS INNER JOIN DRIVERS On "
                + "USERS.ID = DRIVERS.USERS_ID) where USERS.USERNAME='"+userName+"'";//
       

        dbBean.connect((Connection)request.getServletContext().getAttribute("connection"));
        session.setAttribute("dbbean", dbBean);

        if((Connection)request.getServletContext().getAttribute("connection")==null){
            request.getRequestDispatcher("/WEB-INF/conErr.jsp").forward(request, response);
        }
            
        if (request.getParameter("tbl").equals("UserDetails")){
            String Drivermsg="No users";
            try {
                Drivermsg = dbBean.retrieve(driverDetailsqry);
            } catch (SQLException ex) {
                Logger.getLogger(UserServLet.class.getName()).log(Level.SEVERE, null, ex);
            }
            request.setAttribute("driverDetailsqry", Drivermsg);
            request.getRequestDispatcher("/driverDetails.jsp").forward(request, response);
        }
        
        else if (request.getParameter("tbl").equals("jobDone")){
            String journeymsg="No journeys";
            try {
                journeymsg = dbBean.retrieve(journeyqry);
            } catch (SQLException ex) {
                Logger.getLogger(UserServLet.class.getName()).log(Level.SEVERE, null, ex);
            }
            request.setAttribute("journeyquery", journeymsg);
            request.getRequestDispatcher("/driverJourneys.jsp").forward(request, response);
            
        }
        
        else if (request.getParameter("tbl").equals("Update")){
            request.getRequestDispatcher("WEB-INF/passwdChange.jsp").forward(request, response);
        }
        
//        
//        else{   
//            request.setAttribute("msg", "del");
//            request.getRequestDispatcher("/WEB-INF/user.jsp").forward(request, response); 
//        }
//        Statement stmtName = null;
//        String query="SELECT * from USERNAME.DRIVERS";
//        try{
////            driverName = connection.prepareStatement("SELECT NAME from USERNAME.DRIVERS", PreparedStatement.RETURN_GENERATED_KEYS);
//            stmtName = connection.createStatement();
//            ResultSet rs = stmtName.executeQuery(query);
//            while(rs.next()){
//                String driverName = rs.getString("NAME"); 
//            }
//       
//        }catch (SQLException ex) {
//            Logger.getLogger(Jdbc.class.getName()).log(Level.SEVERE, null, ex);
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
