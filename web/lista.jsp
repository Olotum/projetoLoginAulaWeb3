
<%-- 
    Document   : lista
    Created on : 10 de mai. de 2023, 19:36:25
    Author     : QI
--%>
<%@page import="model.ArtistaDAO"%>
<%@page import="model.Artista"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista</h1>
        <hr>
        <table border="1">
            <thead>
                <tr>
                    <th>COD</th>
                    <th>NOME</th>
                    <th>GENERO</th>
                    <th>NACIONALIDADE</th>
                    <th>SOLO</th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <%
                     ArtistaDAO adao  = new ArtistaDAO();
                     for (Artista art : adao.listAll()) {
                     
                %>
                <tr>
                    <td><%=art.getIdArtista()%></td>
                    <td><%=art.getArtista()%></td>
                    <td><%=art.getGenero()%></td>
                    <td><%=art.getNacionalidade()%></td>
                    <td><%=art.getSolo()%></td>
                    <td>
                        <a href="ArtistaUpdate?id=<%=art.getIdArtista() %>">EDITAR</a>
                    </td>
                    
                    <td>
                        <a onclick="confirmDelete(<%=art.getIdArtista()%>)"> EXCLUIR</a>
                    </td>
                </tr>
                <% } %>
            </tbody>
        </table>

        <hr>
        <a href="home.jsp">Página inicial</a>
        
      <script>
            function confirmDelete(id) {
                if(confirm("Deseja realmente excluir?")) {
                    window.location.replace("ArtistaDelete?cod="  + id);
                } else {
                    alert("Exclusão cancelada!");
                }
            }
        </script>
    </body>
</html>
