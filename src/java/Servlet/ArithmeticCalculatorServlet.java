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
public class ArithmeticCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.setAttribute("calresult", "---");
          getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
      
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first=request.getParameter("first");
        String second=request.getParameter("second");
        
        String add=request.getParameter("first");
        String minus=request.getParameter("minus");
        String multiply=request.getParameter("multiply");
        String devide=request.getParameter("devide");
        
        
        
        try 
        {
            int firstInteger=Integer.parseInt(first);
            int secondInteger=Integer.parseInt(second);
            
            
            request.setAttribute("calfirst", first);
            request.setAttribute("calsecond", second);
        
            if (add!=null)            
                request.setAttribute("calresult", firstInteger+secondInteger);
             if (minus!=null)            
                request.setAttribute("calresult", firstInteger-secondInteger);
             if (multiply!=null)            
                request.setAttribute("calresult", firstInteger*secondInteger);
             if (devide!=null)            
                request.setAttribute("calresult", firstInteger/secondInteger);
        }
        catch (Exception e)
        {
            request.setAttribute("calresult", "invalid");
        }
        

        
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
         
         
        
    }


}
