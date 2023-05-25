<%
    if(session.getAttribute("userLoggedSession") == null) {
        response.sendRedirect(request.getContextPath());
    }
%>