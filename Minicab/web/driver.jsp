<%-- 
    Document   : driver
    Created on : 10-Nov-2018, 21:31:49
    Author     : georg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Driver Page</title>
    </head>
    <body>
        <h1>You are a driver!</h1>
          <h1>   <%
            if ( request.getAttribute("message")!=null) {
                out.println(request.getAttribute("message"));
                
            }
        %> </h1>
    </body>
</html>
