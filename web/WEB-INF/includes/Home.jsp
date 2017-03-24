<%-- 
    Document   : formGoHome
    Created on : 20.03.2017, 13:50:34
    Author     : Dynamitos5
--%>

<%@page import="resource.ViewEnum" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<form action="${pageContext.request.contextPath}<%="/"+ViewEnum.START.getView()%>" method="GET">
    <input type="submit" value="HOME" name="Go Home">
</form>