<%-- 
    Document   : arithmeticcalculator
    Created on : 25-Jan-2023, 5:03:46 PM
    Author     : 886152
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>>Arithmetic Calculator Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" >
            <table>
                <tr><td>First:<input type="text" name="first" value="${calfirst}"></td></tr>
                <tr><td>Second:<input type="text" name="second" value="${calsecond}"></td></tr>
                <tr>
                    <td>
                        <input type="submit" value="+" name="add">
                        <input type="submit" value="-" name="minus">
                        <input type="submit" value="*" name="multiply">
                        <input type="submit" value="%" name="devide"></td></tr>
                
            </table> 
                <br>
                Result:${calresult}
        </form>

        <a href="AgeCalculatorServlet">Age Calculator</a> 
    </body>
</html>
