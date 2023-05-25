<%-- 
    Document   : index
    Created on : 8 de mai. de 2023, 19:41:50
    Author     : QI
--%>

<%
   if(session.getAttribute("userLoggedSession") != null){
        response.sendRedirect("home.jsp");
   }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="login">
    <head>
        <link rel="icon" href="img/musica-icon.png"/>
        <link rel="stylesheet" href="css/style.css"/>
        <title>Discoteca virtual</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action="Login" method="post" id="form-login">
            <img src="img/lofi_girl.png" alt="Logotipo discoteca virtual" width="250" />
            <br>
            
            <input type="email" name="user" id="user" class="fields" placeholder="Digite seu email" required>
            <br><br>
            
            <input type="password" name="pass" id="pass" class="fields" placeholder="Digite sua senha" required>
            <br><br>
        
            <input type="submit" value="Entrar">
        </form>
    </body>
</html>
