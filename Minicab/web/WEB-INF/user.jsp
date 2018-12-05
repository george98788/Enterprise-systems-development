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
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Main Page</title>
    </head>
    <body>
         <%@include  file="newbar.html" %>
      <div class="row justify-content-md-center">
                
        <h2>User's details:</h2>
        <%! int i=0;
            String str="Register"; 
            String url = "NewUser.do";
        %>
        <%
            if((String)request.getAttribute("msg")=="del") {
                str = "Delete";
                url = "Delete.do";
            }
            else {
                str="Register";
                url = "NewUser.do";
            } 
        %>
      </div>
        <form method="POST" action="<%=url%>">     
            <div class="row justify-content-md-center">
                <h3> Please provide your following details </h3>
            </div>
           
                
            
            <div class="row justify-content-md-center">
               <table>
                   <tr>
                    <td>Username:</td>
                    <td><input type="text" name="username"/></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password"/></td>
                </tr>
             
                  <tr>
                    <td>Role:</td>
                    <td><input type="text" name="role"/></td>    
                </tr>      
        </table> 
            </div>
            <div class="row justify-content-md-center">
              
                  <input type="submit" value="<%=str%>" class="btn btn-success"/>
               
            </div>
            </table>
       
        </form>  
                   <div class="row justify-content-md-center">
        <%
            if (i++>0 && request.getAttribute("message")!=null) {
                out.println(request.getAttribute("message"));
                i--;
            }
        %>
                   </div>
        </br>
        <div class="row justify-content-md-center">
        <jsp:include page="foot.jsp"/>
        </div>
    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

</html>
