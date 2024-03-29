<%-- 
    Document   : requestCab
    Created on : 19-Nov-2018, 11:32:41
    Author     : georg
--%>

<%@page import="model.UserObject"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Request Cab</title>
    </head>
    <body>
       <%@include  file="WEB-INF/newbar.html" %>
        
       <div class="row justify-content-md-center">
        <h2>Request Cab</h2>
       </div>
       <div class="row justify-content-md-center">
        <form method="POST" action="CustomerRequestServlet.do">
            <h2> Please provide your following details</h2>
            <table> 
                <tr>
                    <td>Customer Name:</td>
                    <td><%
                        if (session.getAttribute("user") != null) {  
                         UserObject userObject = (UserObject) session.getAttribute("user");
                         out.println(userObject.getUsername());
                         
                        }%></td>
                </tr>
                <tr>
                    <td>Pick up Address:</td>
                    <td><input type="text" name="pickUpAdd" placeholder="PickUpAddress" required/></td>
                </tr>
                <tr>
                    <td>Destination:</td>
                    <td><input type="text" name="destination" placeholder="Destination" required/></td>
                </tr>
                <tr>
                    <td>Date:</td>
                    <td><input type="text" name="demands_date" placeholder="Date" required/></td>
                </tr>
                <tr>
                    <td>Time:</td>
                    <td><input type="text" name="demands_time" placeholder="Time" required/></td>
                </tr>
                <tr>
                    <td>Status: </td>
                    <td><input type="text" name="status"/></td>
                </tr>
                
            </table>
               <div class="col-md-10 col-md-offset-5">
              <div class="text-center">
                <button type="submit" value="Register" class="btn btn-success">Book a cab</button>
              </div>
             
            </form>
               <%=((String) (request.getAttribute("msg")) != null) ? (String) (request.getAttribute("msg")) : ""%>
                <jsp:include page="WEB-INF/foot.jsp"/>
               
           </div>
          </div>
       
       </div>
        
    </body>
       <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

</html>
