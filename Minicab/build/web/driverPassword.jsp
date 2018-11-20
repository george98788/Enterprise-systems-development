<%-- 
    Document   : driverPassword
    Created on : 19-Nov-2018, 15:23:37
    Author     : saphi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Driver Page</title>
    </head>
    <body>
        <h1>Driver Password Change</h1>
        
        <%! ;
                String str="driverPassword"; 
                String url = "DriverPassword.do";
                %>
        
        <form method="POST" action="<%=url%>">
            
            <%=(String)(request.getAttribute("driverPassquery"))%>
        </form>
    </body>
</html>
