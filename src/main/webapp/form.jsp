<%-- 
    Document   : form
    Created on : Aug 7, 2018, 10:23:07 PM
    Author     : ayaduwanshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form</title>
    </head>
    <body>
        <form method="POST" action="/jspServlet/NewServlet">
            First Parameter: <input type="text" id="param1" name="param1"><br>
            Second Parameter: <input type="text" id="param2" name="param2"><br>
            Third Parameter: <input type="text" id="param3" name="param3"><br>
            <input type="submit">
        </form>
    </body>
</html>
