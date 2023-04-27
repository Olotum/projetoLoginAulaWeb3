<%-- 
    Document   : home
    Created on : 26 de abr. de 2023, 21:37:02
    Author     : QI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bem vindo <%= request.getAttribute("userLogged") %>!</h1>
    </body>
</html>
