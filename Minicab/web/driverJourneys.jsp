<%-- 
    Document   : driverJourneys
    Created on : 19-Nov-2018, 12:01:08
    Author     : saphi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Driver Page</title>
    </head>
    <body>
        <%@include  file="WEB-INF/newbar.html" %>
        <div class="row justify-content-md-center">
        <h1>Driver Completed Journeys</h1>
         <%! ;
                String str="driverJourney"; 
                String url = "DriverJourneys.do";
                %>
        </div>
        
        <form method="POST" action="<%=url%>">
            <div class="row justify-content-md-center">
                <table>
                    <tr>
                        <td>User ID:</td>
                    </tr>
                    <tr>
                        <td>Username:</td>
                    </tr>
                    <tr>
                        <td>Driver ID:  </td>
                    </tr>
                    <tr>
                        <td>Driver Name:    </td>
                    </tr>
                    <tr>
                        <td>Registration Number:    </td>
                    </tr>
                    <tr>
                        <td>Destination:    </td>
                    </tr>
                    <tr>
                        <td>Distance:   </td>
                    </tr>
                    <tr>
                        <td>Journey Date:   </td>
                    </tr>
                    <tr>
                        <td>Journey Time:   </td>
                    </tr>
                </table>
                
            <%=(String)(request.getAttribute("journeyquery"))%>
            </div>
        </form>
    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

</html>
