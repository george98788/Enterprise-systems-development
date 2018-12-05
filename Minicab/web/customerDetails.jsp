<%-- 
    Document   : customerDetails
    Created on : 20-Nov-2018, 16:59:31
    Author     : georg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Details</title>
    </head>
    <body>
        <%@include  file="WEB-INF/newbar.html" %>
        
    <div class="row justify-content-md-center">
        <h1>Customer Details</h1>
    </div>
        <br><br><br>
       <%! ;
                String str="CustomerDetails"; 
                String url = "CustomerServlet.do";
                %>
            
        <form method="POST" action="<%=url%>">
            <div class="row justify-content-md-center">
                <table>
                    <tr>
                        <td>User ID: </td>
                    </tr>
                    <tr>
                        <td>Username: </td>
                    </tr>
                    <tr>
                        <td>Customer ID: </td>
                    </tr>
                    <tr>
                        <td>Customer Name: </td>
                    </tr>
                    <tr>
                        <td>Customer E-mail: </td>
                    </tr>
                    <tr>
                        <td>Customer Address:   </td>
                    </tr>
                </table>
                <%=(String)(request.getAttribute("customerDetailsqry"))%>
            </div>
        </form><br><br><br>
          
            <div class="row justify-content-md-center">
            <h3>Receipts</h3>
            </div>
            <div class="row justify-content-md-center">
                
<!--                <table>
                    <tr>
                        <td>Invoice ID: </td>
                    </tr>
                    <tr>
                        <td>Customer Name: </td>
                    </tr>
                    <tr>
                        <td>Customer ID: </td>
                    </tr>
                    <tr>
                        <td>Address: </td>
                    </tr>
                    <tr>
                        <td>Destination: </td>
                    </tr>
                    <tr>
                        <td>Demands Date:   </td>
                    </tr>
                    <tr>
                        <td>Demands Time:   </td>
                    </tr>
                    <tr>
                        <td>Status:   </td>
                    </tr>
                    <tr>
                        <td>Driver ID:   </td>
                    </tr>
                     <tr>
                        <td>Price (Inc. Tax):  </td>
                    </tr>
                </table>-->
                <%=(String)(request.getAttribute("customerDemands"))%>
            </div>
           
        <br><br><br>
       
    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

</html>
