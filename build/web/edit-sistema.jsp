<%-- 
    Document   : cadastro
    Created on : 8 de mai. de 2023, 16:22:48
    Author     : QI
--%>
<%@page import="model.Sistema" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Sistema t = (Sistema)request.getAttribute("Sistema");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>cadastro de funcionario</title>
    </head>
    <body>
        <h1>Editar dados</h1>
        <hr>
                
        <form action="TitularController" method="post">
            <input type="text" name="id" value="<%= t.getIdSistema() %>" readonly>
            <br><br>
            
            <input type="text" name="user" value="<%= t.getNome() %>" placeholder="Nome do usuário" required>
            
            <br><br>
            <input type="date" name="nasc" value="<%= t.getNascimento() %>" required>
            
            <br><br>
            <input type="text" name="cpf" value="<%= t.getCpf() %>" placeholder="CPF" required>

            <br><br>
            <input type="text" name="ra" value="<%= t.getRa() %>" placeholder="CEP" required>
            
            <br><br>
            <select name="tipo" required>
                <option value="<%= t.getTipo() %>"><%= t.getTipo() %></option>
                <option value="gerente">gerente</option>
                <option value="diretor">diretor</option>
                <option value="Outro funcionarios">Outro funcionarios</option>
            </select>
            
            <br><br>
            <input type="submit" value="Atualizar">
            <input type="reset" value="Restaurar">
        </form>
        
        <hr>
        <a href="home.jsp">Voltar para página inicial</a>
    </body>
</html>
