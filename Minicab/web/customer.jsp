<%-- 
    Document   : customer
    Created on : 10-Nov-2018, 21:32:24
    Author     : georg
    Comments   : Only the customer can see this page, able to book a cab and change their details.
--%>

<%@page import="model.CustomerObject"%>
<%@page import="model.Jdbc"%>
<%@page import="model.UserObject"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Page</title><%
            UserObject userObject = (UserObject) session.getAttribute("user");
            Jdbc jdbc = (Jdbc) session.getAttribute("dbbean");
            if (jdbc.role(userObject.getUsername(), userObject.getPassword()) == "driver" ) {
                request.getRequestDispatcher("/WEB-INF/conErr.jsp").forward(request, response);
            }
        %>
    </head>

    <body>
       <%@include  file="WEB-INF/newbar.html" %>
        <div class="row justify-content-md-center">
            <header>
            <h2>Hello Customer</h2>
        </header>
        </div>
        <div class="row justify-content-md-center">
            <h1>   <%
                if (request.getAttribute("message") != null) {
                    out.println(request.getAttribute("message"));
                }
                %> </h1>

        </div>
            <form method="POST" action="CustomerServlet.do">

               
        </div>
                <div class="row justify-content-md-center">
                <input type="radio" name="tbl" value="RequestCab">Request Cab<br/>
                </div>
               <div class="row justify-content-md-center">
                <input type="radio" name="tbl" value="Update">Password Change<br/>
               </div>
                <div class="row justify-content-md-center">
                <input type="radio" name="tbl" value="UserDetails">View Your Details<br/>
                </div>
        
        <div class="row justify-content-md-center">
                <button type="submit" value="Action" class="btn btn-success">Submit</button> 
                <form method="POST" action="Logout.do">
                     <button type="submit" value="Logout" class="btn btn-danger">Log Out</button><br />
                </form> 
            </form> 
            </div>
        
    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

</html>
