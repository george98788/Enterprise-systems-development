<%-- 
    Document   : driver
    Created on : 10-Nov-2018, 21:31:49
    Author     : georg
--%>

<%@page import="model.Jdbc"%>
<%@page import="model.UserObject"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%
            UserObject userObject = (UserObject) session.getAttribute("user");
            Jdbc jdbc = (Jdbc) session.getAttribute("dbbean");
            if (jdbc.role(userObject.getUsername(), userObject.getPassword()) != "driver" ||  jdbc.role(userObject.getUsername(), userObject.getPassword()) != "admin"){
                request.getRequestDispatcher("/WEB-INF/conErr.jsp").forward(request, response);
            }
        %>
        <title>Driver Page</title>
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
          <div class="container">
           <%! ;
            String str=""; 
            String url = "";    
            %>
            <% 
            if((String)request.getAttribute("qry") !="No users") {
                str="Driver"; 
                url = "DriverDetails.do";
            }
            %>
         
         
             
        <header>
        <h2>Driver View</h2>
        </header>
               <div class="centre"> 
         
          
        <form method="POST" action="<%=url%>">
        <p />
         <div class="centre">
            <h3>Driver details</h3>
         </div>
        <input type="radio" name="tbl" value="jobDone">Completed journeys<br />
            <input type="radio" name="tbl" value="Update">Password Change<br />
            <input type="radio" name="tbl" value="UserDetails">View Your Details<br />
      
            <div class="col-md-10 col-md-offset-5">
              <div class="text-center">
                <input type="submit" value="Action" class="btn btn-primary" />
                <a href="register.jsp" class="btn btn-primary">Register</a>
                
          <form method="POST" action="Logout.do">
            <button type="submit" value="Logout" class="btn btn-danger">Log Out</button>
            <br />
          </form> 
              </div>
            </div>
            
         
      
          </div>  
          </div>
         
      
    </body>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

</html>
