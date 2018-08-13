/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ayaduwanshi
 */
@WebServlet(name = "NetBeansServlet", urlPatterns = {"/NetBeansServlet"})
public class NetBeansServlet extends HttpServlet {

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
            out.println("<title>Servlet NetBeansServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>User response on loginForm.jsp</h1>");
            
            String loginEmail = request.getParameter("loginEmail");
            String loginPassword = request.getParameter("loginPassword");

            if ((loginEmail == null && loginPassword == null) || (loginEmail.trim().equals("") && loginPassword.trim().equals(""))) {
                out.println("<p>Email: Email is empty</p>");
                out.println("<p>Password: Password is empty</p>");
            } else {
                out.println("<p>Email: " + request.getParameter("loginEmail") + "</p>");
                out.println("<p>Password: " + request.getParameter("loginPassword") + "</p>");
            }

            // Quick demo for Server Side Include with RequestDispatcher
            // this will get the output from the servelet and will include it in our code and will show it to the client
            // RequestDispatcher dispatcher = request.getRequestDispatcher("/IncludeServlet");
            // dispatcher.include(request, response); // include will get everything from the IncludeServlet
            
            // This is the same example as above but instead of including this will forward and will show the output of the forward only
            // RequestDispatcher dispatcher = request.getRequestDispatcher("/ForwardServlet");
            // dispatcher.forward(request, response); // forward will navigate the user to the ForwardServlet
            
            out.println("</body>");
            out.println("</html>");

            // our code will work till this point and not proceed further
            // out.flush();

            // this is the way to send a response here we are redirecting to google
            // response.sendRedirect("https://www.google.com/");
            // response.sendError(HttpServletResponse.SC_FORBIDDEN, "You shall not pass!!!");
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
