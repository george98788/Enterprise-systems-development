<%-- 
    Document   : driver
    Created on : 10-Nov-2018, 21:31:49
    Author     : georg
    Comments   : Only drivers can see this page. able to see their journeys for their records.
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
            if (jdbc.role(userObject.getUsername(), userObject.getPassword()) == "customer" ) {
                request.getRequestDispatcher("/WEB-INF/conErr.jsp").forward(request, response);
            }
        %>
        
       
        <title>Driver Page</title>
    </head>
     
      <body>
    <%@include  file="WEB-INF/newbar.html" %>
          
        <div class="row justify-content-md-center">
<!--        <header>
        <h2>Driver View</h2>
        </header>-->
        </div>
        <div class="row justify-content-md-center">
          <%
                if (request.getAttribute("message") != null) {
                    out.println(request.getAttribute("message"));
                }
          %>
        </div>
        <form method="POST" action="DriverDetails.do">
            
        <p />
         <div class="row justify-content-md-center">
            <h3>Driver details</h3>
         </div>
        <div class="row justify-content-md-center">
        <input type="radio" name="tbl" value="jobDone">Completed journeys<br />
        </div>
        <div class="row justify-content-md-center">
            <input type="radio" name="tbl" value="Update">Password Change<br />
        </div>
        <div class="row justify-content-md-center">
            <input type="radio" name="tbl" value="UserDetails">View Your Details<br />
        </div>
            <div class="row justify-content-md-center">
              <div class="text-center">
                <input type="submit" value="Action" class="btn btn-primary" />
                <a href="register.jsp" class="btn btn-primary">Register</a>
                  </form>
        <div class="row justify-content-md-center">
          <form method="POST" action="logout.do">
            <button type="submit" value="Logout" class="btn btn-danger">Log Out</button>
            <br />
          </form> 
        </div>
              </div>
            </div>
          
         
      
    </body>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

</html>
