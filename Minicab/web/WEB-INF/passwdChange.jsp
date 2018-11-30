<%-- 
    Document   : passwdChange
    Created on : 11-Mar-2016, 01:02:16
    Author     : me-aydin
--%>

<%@page import="model.UserObject"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change Password</title>
    </head>
    <body>
         <%@include  file="WEB-INF/newbar.html" %>
         <div class="row justify-content-md-center">
        <h2>Password change</h2>
         </div>
         <div class="row justify-content-md-center">
        <form method="POST" action="Update.do">     
            <table>
                
                  
                    <th>Please provide your following details</th>
               
                <tr>
                    <td> User:          <%
                        if (session.getAttribute("user") != null) {  
                         UserObject userObject = (UserObject) session.getAttribute("user");
                         out.println(userObject.getUsername());
                         
                        }%> </td>

                </tr>
                <tr>
                    <td>New Password:</td>
                    <td>
                        <input type="password" name="password"/>
                        <input type="password" pattern=".{8,}"   required title="8 characters minimum">
                        <input type="password" pattern=".{8,12}" required title="8 to 12 characters">
                    </td>
                </tr>
                <tr>
                    <td>Confirm Password:</td>
                    <td>
                        <input type="password" name="newpasswd" pattern=".{8,12}" required title="8 to 12 characters"/>
                    </td>
                </tr>
            </table>
                </div>
                        <div class="row justify-content-md-center">
                <tr> 
                    <td> <button type="submit" value="Change" class="btn btn-info">Update</button></td>
                </tr>
            
         </div>
        </form>
                         <div class="row justify-content-md-center">
        <%=((String) (request.getAttribute("msg")) != null) ? (String) (request.getAttribute("msg")) : ""%>
<!--        <a href="customer.jsp">Back to Main</a>-->
        <jsp:include page="foot.jsp"/>
                         </div>
    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

</html>