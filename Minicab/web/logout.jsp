<%-- 
    Document   : logout
    Created on : 11-Nov-2018, 20:48:11
    Author     : saphi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout</title>
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
     <header>
        <h2>Logged out View</h2>
        </header>
    <body>
         <div class="centre">
        <h2>Successfully logged out!</h2>
         <a href="login.jsp"> Back to Login </a>
         <div/>
    </body>
</html>