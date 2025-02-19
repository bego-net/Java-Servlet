/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author bego
 */


@WebServlet("/square")
public class SquareServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the sum from the request attributes
        int sum = (int) request.getAttribute("sum");

        // Calculate the square of the sum
        int square = sum * sum;

        // Display the results
        response.setContentType("text/html");
        response.getWriter().println("<h1>Results</h1>");
        response.getWriter().println("<p>Sum: " + sum + "</p>");
        response.getWriter().println("<p>Square of Sum: " + square + "</p>");
    }
}
