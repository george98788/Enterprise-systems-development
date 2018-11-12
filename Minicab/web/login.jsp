

<%@page import="model.Jdbc"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Login Main Page</title>
        <style>
            * {
                box-sizing: border-box;
            }
            header {
                background-color: #666;
                padding: 5px;
                text-align: center;
                font-size: 35px;
                color: white;
            }
            body {
                font-family: Arial, Helvetica, sans-serif;
            }
            
            .centre {
                margin: auto;
                width: 25%;
                    padding:10px;
                
            }
            
        </style>
    </head>
    <body>
        <header>
        <h2>Login Page:</h2>
        </header>
      <%! ;
            String str="login"; 
            String url = "loginP.do";
        %>
        <div class="centre">
            
        <form method="POST" action="loginP.do">  
            <h3> Please provide your following details </3>
                <br>
                </br>
                
            <table>
              <!--  <tr>
                    <th></th>
                    <th>Please provide your following details</th>
                </tr>!-->
                <tr>
                    <td>Username:</td>
                    <td><input type="text" name="username" placeholder="username"/></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password" placeholder="password"/></td>
                </tr>
                <tr> 
                    <td> <input type="submit" value="login"/></form> <form method="POST" action="register.jsp"><input type="submit" value="Register"/></td>
                </tr>
            </table>
   
        </form>  
        
        </div>
              
        <%
            if ( request.getAttribute("message")!=null) {
                out.println(request.getAttribute("message"));
                
            }
        %>
       
        </br>
    
    </body>
</html>