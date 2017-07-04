<%-- 
    Document   : newpage
    Created on : Dec 2, 2016, 7:01:20 AM
    Author     : shrut
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% String jspname=(String)request.getAttribute("sd");
        out.println("your name is "+jspname);
        %>
                
    </body>
</html>
