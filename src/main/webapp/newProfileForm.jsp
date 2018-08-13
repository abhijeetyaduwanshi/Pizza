<%-- 
    Document   : newProfileForm
    Created on : Aug 6, 2018, 10:09:48 PM
    Author     : ayaduwanshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create a new pizza profile</title>
    </head>
    <body>
        <form method="POST" action="/jspServlet/NetBeansServlet">
            First Name: <input type="text" id="firstName" name="firstName"><br>
            Last Name: <input type="text" id="lastName" name="lastName"><br>
            Email Address: <input type="email" id="email" name="email"><br>
            Confirm Email Address: <input type="confirmEmail" id="confirmEmail" name="confirmEmail"><br>
            Primary Phone Number: <input type="tel" id="phone" name="phone"><br>
            Password: <input type="password" id="password" name="password"><br>
            Confirm Password: <input type="password" id="ConfirmPassword" name="ConfirmPassword"><br>
            <input type="submit" value="CREATE MY PROFILE">
        </form>
    </body>
</html>
