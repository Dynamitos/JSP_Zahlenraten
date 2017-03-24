<%-- 
    Document   : index
    Created on : 10-Mar-2017, 08:45:03
    Author     : Juergen
--%>

<%@page import="resource.ViewResourceEnum"%>
<%@page import="javax.faces.application.ViewResource"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            response.sendRedirect(pageContext.getServletContext().getContextPath() + ViewResourceEnum.START.getView());
        %>
    </body>
</html>
