<%-- 
    Document   : Age Calculator
    Created on : 25-Jan-2023, 4:20:07 PM
    Author     : 886152
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" >
            Enter your age:<input type="text" name="age" value="${age}">
            <br>
            <input type="submit" value="age next birthday">
        </form>
        <br>
        <em>${errMsg}</em>
        <br>
        <a href="ArithmeticCalculatorServlet">Arithmetic Calculator</a> 


    </body>
</html>
