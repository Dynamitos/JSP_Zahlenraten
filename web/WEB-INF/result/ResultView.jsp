<%-- 
    Document   : helloWorldView
    Created on : 13-Mar-2017, 14:36:42
    Author     : Juergen
--%>

<%@page import="resource.ViewResourceEnum"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World result view!</h1>
        ${helloWorldBean.htmlCapital}
        <jsp:include page="<%=ViewResourceEnum.FORM_GO_HOME.getView()%>"></jsp:include>
    </body>
</html>
