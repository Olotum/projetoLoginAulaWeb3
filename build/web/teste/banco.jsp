<%@page import="java.sql.SQLException" %>
<%@page import="model.MyDatabase" %>

<% 
    try{ 
        MyDatabase.getDatabase();
        out.print("Conexão ok: ");
        out.print(MyDatabase.getDatabase().getCatalog());
        
    }catch(SQLException | ClassNotFoundException e){
        out.print("Falha na conexão: " + e);
        
    }
%>