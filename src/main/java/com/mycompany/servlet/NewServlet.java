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
@WebServlet(name = "NewServlet", urlPatterns = {"/newServlet"})
public class NewServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // super.doGet(req, resp);
        try(PrintWriter out = response.getWriter()) {
            out.println("I am some plain text for an example");

            // this is a way to get the required header
            out.println("<p>Request Header - " + request.getHeader("User-Agent") + "</p>");
            out.println("<p>Request Header - " + request.getHeader("Accept") + "</p>");
            out.println("<p>Request Header - " + request.getHeader("Accept-Encoding") + "</p>");
            out.println("<p>Request Header - " + request.getHeader("Connection") + "</p>");
            out.println("<p>Request Header - " + request.getHeader("Referer") + "</p>");
            // also here is the reference to the other headers
            // https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
        try(PrintWriter out = resp.getWriter()) {
            // if any of the fields in the form.jsp is left empty then it will consider that as empty strings, its not null its blank
            // if the
            out.println("<p>Param 1: " + req.getParameter("param1") + "</p>");
            out.println("<p>Param 2: " + req.getParameter("param2") + "</p>");
            out.println("<p>Param 3: " + req.getParameter("param3") + "</p>");

            // if there is any case where the param is not passed then in that case the field is null
            out.println("<p>Param 4: " + req.getParameter("param4") + "</p>");

            // these are the session methods
            out.println(req.getSession());
        }
    }
}
