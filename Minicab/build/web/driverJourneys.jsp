<%-- 
    Document   : driverJourneys
    Created on : 19-Nov-2018, 12:01:08
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
        <h1>Driver Completed Journeys</h1>
         <%! ;
                String str="driverJourney"; 
                String url = "DriverJourneys.do";
                %>
        
        <form method="POST" action="<%=url%>">
            
            <%=(String)(request.getAttribute("journeyquery"))%>
        </form>
    </body>
    
</html>
