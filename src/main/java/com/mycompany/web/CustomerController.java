/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.web;

import com.mycompany.model.Customer;
import com.mycompany.service.CrmService;
import com.mycompany.service.CrmServiceImpl;
import com.mycompany.util.WebUtil;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ayaduwanshi
 */
@WebServlet(name = "CustomerController", urlPatterns = {
    "/customer",
    "/customers"
})
public class CustomerController extends HttpServlet {

    private CrmService svc = new CrmServiceImpl();
    private static final Logger LOG = Logger.getLogger(CustomerController.class.getName());

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

        LOG.info("inside doGet method");

        // try(PrintWriter out = response.getWriter()) {
        //     out.println("<h1>I am the doGet method</h1>");
        //     out.println("<ul>");
        //
        //    for(Customer c : svc.findCustomers()) {
        //        out.println("<li>" + c.toString() + "</li>");
        //    }
        //
        //    out.println("</ul>");
        //}

        Map<String, String> messages = new HashMap<>();
        request.setAttribute("messages", messages);
        

        switch(request.getServletPath()) {
            case "/customers" :
                LOG.info("Dispatcher to /customers");
                request.setAttribute("customers", svc.findCustomers());
                request.getRequestDispatcher("/WEB-INF/pages/customers/customers.jsp").forward(request, response);
                break;

            case "/customer" :
                LOG.info("Dispatcher to /customer");
                
                if(WebUtil.isEmpty(request.getParameter("id"))) {
                    LOG.warning("ID was not passed as a parameter.");
                    messages.put("No ID Error", "This is a message from your controller. Please enter an ID.");
                    throw new ServletException("No ID was passed. Try again!");
                }
                
                Long id = Long.parseLong(request.getParameter("id"));
                request.setAttribute("customer", svc.findCustomer(id));
                request.getRequestDispatcher("/WEB-INF/pages/customers/customer.jsp").forward(request, response);
                break;
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

        // in this we are checking to be on a safer side and to be more effecient
        if(LOG.isLoggable(Level.FINEST)) {
            LOG.finest("inside doPost method");
        }

        try(PrintWriter out = response.getWriter()) {
            out.println("<h1>I am the doPost method</h1>");
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
