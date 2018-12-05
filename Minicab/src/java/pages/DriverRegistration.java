/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages;

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
public class DriverRegistration extends HttpServlet {

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

        String[] query = new String[4];
        String[] query2 = new String[2];
        query[0] = (String) request.getParameter("fullname");
        query[1] = (String) request.getParameter("registration");
        query[2] = (String) request.getParameter("usernameReg");
        query[3] = (String) request.getParameter("passwordReg");
        query2[0] = (String) request.getParameter("usernameReg");
        query2[1] = (String) request.getParameter("passwordReg");
        //String insert = "INSERT INTO `Users` (`username`, `password`) VALUES ('";
         
        Jdbc jdbc = (Jdbc) session.getAttribute("dbbean");
        UserObject userObject = new UserObject(query2);
        session.setAttribute("user", userObject);
        if (jdbc == null) {
            request.getRequestDispatcher("/WEB-INF/conErr.jsp").forward(request, response);
        }
        if (jdbc.exists(query[2])) {
            request.setAttribute("message", query[2] + " is already taken as username");
           
        } else {
            jdbc.registerDriver(query);
            request.setAttribute("message", query[2] + " is added");
            request.getRequestDispatcher("/driver.jsp").forward(request, response);
        }
        request.getRequestDispatcher("/driverRegister.jsp").forward(request, response);
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
