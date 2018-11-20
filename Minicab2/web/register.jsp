<%-- 
    Document   : register
    Created on : 11-Nov-2018, 16:59:58
    Author     : georg, liz, saph, rhys, jeniel 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
         <nav class ="navbar navbar-inverse bg-dark">
            <a class="navbar-brand" href="/Minicab/login.jsp">Log in</a>
            <a class="navbar-brand" href="/Minicab/register.jsp">Register</a>
            <a class="navbar-brand" href="/Minicab/driver.jsp">Driver</a>
            <a class="navbar-brand" href="/Minicab/customer.jsp">Customer</a>
        </nav>
        <div class="row justify-content-md-center">
    <form method="POST" action="CustomerRegistration.do">    
        <h2> Please provide your following details</h2>
            <table>       
                <tr>
                    <td>Full name:</td>
                    <td><input type="text" name="fullname" placeholder="Full Name" required/></td>
                </tr>
                <tr>
                    <td>House/Flat Number:</td>
                    <td><input type="text" name="houseNo" placeholder="House/Flat Number" required/></td>
                </tr>
                <tr>
                    <td>Street/Road Name:</td>
                    <td><input type="text" name="roadName" placeholder="Street/Road" required/></td>
                </tr>
                 <tr>
                    <td>City/Town name:</td>
                    <td><input type="text" name="cityName" placeholder="City/Town" required/></td>
                </tr>
                 <tr>
                    <td>Postal Code:</td>
                    <td><input type="text" name="postcode" placeholder="Postal Code" required/></td>
                </tr>
                <tr>
                    <td>Username:</td>
                    <td><input type="text" name="usernameReg" placeholder="Username" required/></td>
                </tr>
                  <tr>
                    <td>Password:</td>
                    <td><input type="password" name="passwordReg" placeholder="Password"required/></td>
                </tr>
            </table>
                <div class ="input-group mb-3">
                    <input type="submit" value="Register" class="btn btn-primary"/>
                </div>
                 </form>   
        </div>
        <%
            if ( request.getAttribute("message")!=null) {
                out.println(request.getAttribute("message"));
              
            }
        %>
    </table>
        </form>   
    </form>  
    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

</html>
