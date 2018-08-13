<%-- 
    Document   : loginForm
    Created on : Aug 1, 2018, 8:56:00 PM
    Author     : ayaduwanshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pizza login form</title>
    </head>
    <body>
        <p>SIGN IN TO YOUR PIZZA PROFILE</p>
        <p>Don't have one? <a href="#">CREATE ONE</a></p>
        <form method="POST" action="/jspServlet/NetBeansServlet">
            Email: <input type="text" id="loginEmail" name="loginEmail"><br>
            Password: <input type="password" id="loginpassword" name="loginPassword"><br>
            <input type="submit" value="Sign In For this Order"><br>
            <!--<button>Sign In & Keep Me Signed In</button><br>-->
            <!--<input type="submit" value="Sign In & Keep Me Signed In"><br>-->
            <a href="#">Forgot password?</a>
        </form>
    </body>
</html>
