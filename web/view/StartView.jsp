<%-- 
    Document   : helloWorldStartView
    Created on : 10-Mar-2017, 08:48:48
    Author     : Juergen
--%>

<%@page import="resource.ServletEnum"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HelloWorldStartView</title>
    </head>
    <body>
        <h1>Zahlen raten!</h1>
        <form action="${pageContext.request.contextPath}<%=ServletEnum.HELLOWORLD.getUrlPattern()  %>" method="GET">
            Your Guess Here: 
            <input type="text" name="guess" placeholder="Any Number"/>
            <input type="submit" name="submit" value="submit"/>
        </form>
    </body>
</html>
