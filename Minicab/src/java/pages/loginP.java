/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages;

import java.io.IOException;
import java.sql.Connection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Jdbc;
import model.UserObject;

/**
 *
 * @author me-aydin
 */
public class loginP extends HttpServlet {

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
        String qry = "select * from users";

        HttpSession session = request.getSession();

        response.setContentType("text/html;charset=UTF-8");

        Jdbc dbBean = new Jdbc();
        dbBean.connect((Connection) request.getServletContext().getAttribute("connection"));
        session.setAttribute("dbbean", dbBean);

        response.setContentType("text/html;charset=UTF-8");

        String[] query = new String[2];
        query[0] = (String) request.getParameter("username");
        query[1] = (String) request.getParameter("password");
        UserObject userObject = new UserObject(query);
//        CustomerObject customerObject = new CustomerObject();
        session.setAttribute("user", userObject);
        
        Jdbc jdbc = (Jdbc) session.getAttribute("dbbean");

        if (jdbc == null) {
            request.getRequestDispatcher("/WEB-INF/conErr.jsp").forward(request, response);
        }

        if (query[0].equals("") || query[1].equals("")) {
            session.setAttribute("message", "Username or Password cannot be NULL");
        } else if (jdbc.existsForlogin(query[0], query[1])) {
            if (jdbc.role(query[0], query[1]) == "admin") {
                request.setAttribute("message", "Logged in as " + query[0]);
                request.getRequestDispatcher("adminView.jsp").forward(request, response);
            } else if (jdbc.role(query[0], query[1]) == "driver") {
                request.setAttribute("message", "Logged in as " + query[0]);
                request.getRequestDispatcher("driver.jsp").forward(request, response);   
            }          
            else {
                request.setAttribute("message", "Logged in as " + query[0]);
                request.getRequestDispatcher("customer.jsp").forward(request, response);    
            }
        } else {
            request.setAttribute("message", "Incorrect username or password ");
        }
        request.getRequestDispatcher("login.jsp").forward(request, response);
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
