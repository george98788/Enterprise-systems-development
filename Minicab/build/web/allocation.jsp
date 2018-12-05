<%-- 
    Document   : modify
    Created on : 03-Dec-2018, 14:28:20
    Author     : lizziecrouch
--%>

<%@page import="model.Jdbc"%>
<%@page import="model.UserObject"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html> 
    <%@include  file="WEB-INF/newbar.html" %>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%
           // UserObject userObject = (UserObject) session.getAttribute("user");
            //Jdbc jdbc = (Jdbc) session.getAttribute("dbbean");
            //if (jdbc.role(userObject.getUsername(), userObject.getPassword()) == "admin" ) {
            //    request.getRequestDispatcher("/WEB-INF/conErr.jsp").forward(request, response);
            //}
        %>
        <title>Assign a driver</title>
    </head>
    <div class="row justify-content-md-center">
        <h1> Assign a driver </h1><br><br>
    </div>
      <body>
     <form method="POST" action="DriverAllocation.do">
        <div class="row justify-content-md-center">
            <%=(String)(request.getAttribute("allocationquery"))%>  

        </div><br><br>
        <div class="row justify-content-md-center">
        <h3>Available Drivers</h3>
        </div>
        <div class="row justify-content-md-center">
            <%=(String)(request.getAttribute("driverAvailable"))%> 
        </div>
        
   
        <div class="row justify-content-md-center">
            <input type="submit" name="assign" value="Assign a driver"/>
        </div>
    </form>
        
    </body>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

</html>