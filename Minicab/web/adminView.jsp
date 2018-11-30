<%-- 
    Document   : selection
    Created on : 10-Nov-2018, 19:34:32
    Author     : georg
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin View</title>
             
    </head>
    <body>
          <%@include  file="WEB-INF/newbar.html" %>
          <div class="row justify-content-md-center">
        <header>
        <h2>Admin View</h2>
        </header>
         </div>
        <h1>   <%
            if ( request.getAttribute("message")!=null) {
                out.println(request.getAttribute("message"));
       
            }
        %> </h1>
        <form method="POST" action="UserService.do">
        <p />
             <div class="row justify-content-md-center">
            <input type="radio" name="tbl" value="List">List Users<br />
            </div>
             <div class="row justify-content-md-center">
            <input type="radio" name="tbl" value="NewUser">New User<br />
            </div>
         <div class="row justify-content-md-center">
            <input type="radio" name="tbl" value="Update">Password Change<br />
        </div>
         <div class="row justify-content-md-center">
            <input type="radio" name="tbl" value="Delete">Delete a User<br />
        </div>
           <div class="row justify-content-md-center">
                <button type="submit" value="Action" class="btn btn-success">Submit</button> 
        </form>
                <form method="POST" action="Logout.do">
                     <button type="submit" value="Logout" class="btn btn-danger">Log Out</button><br />
 </form> 
            
    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

</html>