<%-- 
    Document   : cadastro
    Created on : 10 de mai. de 2023, 19:24:48
    Author     : QI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <h1>Cadastro</h1>
        <hr>
        <form action="CadastroArtista" method="post">
            <h3>Novo artista</h3>
            <input type="text" name="artista" placeholder="Nome do Artista">
            <br><br>
            <select name="genero" required>
                <option value="">Selecione o gênero</option>
                <option value="1">Rock</option>
                <option value="2">POP</option>
                <option value="3">Samba</option>
            </select>    
            <br><br>
            <input type="text" name="nacionalidade" placeholder="Nacionalidade">
            <br></br>
            <input type="checkbox" name="solo" value="sim"><label>Artista solo?</label>
            <br><br>
            <input type="submit" value="cadastrar">
        </form>
        <a href="home.jsp">Pagina inicial</a>
    </body>
</html>
