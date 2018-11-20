<%-- 
    Document   : driverDetails
    Created on : 13-Nov-2018, 19:26:32
    Author     : saphi
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Driver Page</title>
    </head>
    <body>
        <h1>Driver Details</h1>

                <%! ;
                String str="driverDetails"; 
                String url = "DriverDetails.do";
                %>
            
        <form method="POST" action="<%=url%>">
            <%=(String)(request.getAttribute("query"))%>
        </form>
    </body>
</html>
