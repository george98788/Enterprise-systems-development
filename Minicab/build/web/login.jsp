<%-- 
    Document   : driver
    Created on : 01-Nov-2015, 15:18:08
    Author     : me-aydin
--%>

<%@page import="model.Jdbc"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Main Page</title>
    </head>
    <body>
        <h2>Login Page:</h2>
      <%! ;
            String str="login"; 
            String url = "loginP.do";
        %>
      
        <form method="POST" action="loginP.do">     
            <table>
                <tr>
                    <th></th>
                    <th>Please provide your following details</th>
                </tr>
                <tr>
                    <td>Username:</td>
                    <td><input type="text" name="username" placeholder="username"/></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password" placeholder="password"/></td>
                </tr>
                <tr> 
                    <td> <input type="submit" value="login"/></td>
                </tr>
            </table>
        </form>   
                  </form>   
        <%
            if ( request.getAttribute("message")!=null) {
                out.println(request.getAttribute("message"));
                
            }
        %>
       
        </br>
        
    </body>
</html>
