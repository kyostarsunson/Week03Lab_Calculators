/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 886152
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String agePara = request.getParameter("age");
        int nextage = 0;

        try {

            if (agePara == null) {
                request.setAttribute("errMsg", "You must give your current age");
            } else {
                nextage = Integer.parseInt(agePara) + 1;
                request.setAttribute("errMsg", "your next age will be " + nextage);
            }
        } catch (Exception e) {
            request.setAttribute("errMsg", "You must enter a number.");

        }
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);

    }
}
