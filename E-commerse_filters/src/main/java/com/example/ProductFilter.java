package com.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// Remove or comment out the annotation
// @WebServlet("/products")
public class ProductFilter extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h1>Product List</h1>");
        response.getWriter().println("<ul>");
        response.getWriter().println("<li>Product 1</li>");
        response.getWriter().println("<li>Product 2</li>");
        response.getWriter().println("<li>Product 3</li>");
        response.getWriter().println("</ul>");
    }
}
