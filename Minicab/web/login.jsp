<<<<<<< HEAD
<%@page import="model.Jdbc"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
     <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Login Main Page</title>
        
    </head>
    <body>
        <nav class ="navbar navbar-dark bg-dark">
            <a class="navbar-brand" href="/Minicab/login.jsp">Log in</a>
        </nav>
        
    <div class ="container">
      <%! ;
            String str="login"; 
            String url = "loginP.do";
        %>
        <div class="row justify-content-md-center">
           
            <br>
            <br/>
        <form method="POST" action="loginP.do">  
            <h3> Please provide your following details </3>
                <br>
                </br>
                
            <table>             
                <tr>
                    <td>Username:</td>
                    <td><input type="text" name="username" placeholder="username"/></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password" placeholder="password"/></td>
                </tr>
                
                <td> </div></form> 
            <div class ="row">
                <div class="col-md-10 col-md-offset-5"></div>
                <div class ="input-group mb-3">
                    <input type="submit" value="login" class="btn btn-primary"/>
                </div>
            </div>

            <form method="POST" action="register.jsp">
                <div class ="input-group mb-3">
                    <input type="submit" value="register" class="btn btn-primary"/>
                </div>
            </form>  
            </table>
        </div>
    </div>

        <%
            if ( request.getAttribute("message")!=null) {
                out.println(request.getAttribute("message"));
                
            }
        %>
    </div> 
        </br>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>
=======
<%@page import="model.Jdbc"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
     <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Login</title>
        
    </head>
    <body>
        <nav class ="navbar navbar-inverse bg-dark">
            <a class="navbar-brand" href="/Minicab/login.jsp">Log in</a>
            <a class="navbar-brand" href="/Minicab/register.jsp">Register</a>
            <a class="navbar-brand" href="/Minicab/driver.jsp">Driver</a>
            <a class="navbar-brand" href="/Minicab/customer.jsp">Customer</a>
        </nav>
        
   <div class="container">
<%! ;
            String str="login"; 
            String url = "loginP.do";
        %>
  <div class="row justify-content-md-center">

    <br>
    <br/>
    <form method="POST" action="loginP.do">

      <h3> Please provide your following details </3>

        <table>
          <tr>
            <td>Username:</td>
            <td><input type="text" name="username" placeholder="username" /></td>
          </tr>
          <tr>
            <td>Password:</td>
            <td><input type="password" name="password" placeholder="password" /></td>
          </tr>
        </table>

        <div class="row">
          <div class="col-md-10 col-md-offset-5">
            <div class="input-group mb-3">
              <input type="submit" value="Login" class="btn btn-primary" />
              <a href="register.jsp" class="btn btn-primary">Register</a>
            </div>
          </div>
        </div>
    </form>
  </div>
</div>

        <%
            if ( request.getAttribute("message")!=null) {
                out.println(request.getAttribute("message"));
                
            }
        %>
   
        </br>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>
>>>>>>> parent of 59300a6... Merge pull request #10 from george98788/lizziebranch
