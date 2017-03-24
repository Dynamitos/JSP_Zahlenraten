<%-- 
    Document   : helloWorldStartView
    Created on : 10-Mar-2017, 08:48:48
    Author     : Juergen
--%>

<%@page import="resource.ServletResourceEnum"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HelloWorldStartView</title>
    </head>
    <body>
        <h1>Hello World Start View</h1>
        <form action="${pageContext.request.contextPath}<%=ServletResourceEnum.HELLOWORLD.getUrlPattern()  %>" method="GET">
            Please enter a color:
            <input type="text" name="color">
            <input type="submit" name="submit" value="submit">
        </form>
    </body>
</html>
