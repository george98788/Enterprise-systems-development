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
         <nav class="navbar navbar-light bg-light">
  <a class="navbar-brand" href="#">
    <img src="Alpha_Cab_Logo.png" width="30" height="30" class="d-inline-block align-top" alt="">
    logo
  </a>
  <a class="navbar-brand" href="#">Minicab</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="/Minicab/login.jsp">Log In <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/Minicab/register.jsp">Register</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/Minicab/driver.jsp">Driver</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/Minicab/customer.jsp">Customer</a>
      </li>
    </ul>
  </div>
</nav>
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
                    <td><input type="password" name="password"/></td>
                </tr>
                <tr>
                    <td>Confirm Password:</td>
                    <td><input type="password" name="newpasswd"/></td>
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
        <jsp:include page="foot.jsp"/>
                         </div>
    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

</html>