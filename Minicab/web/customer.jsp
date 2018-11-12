<%-- 
    Document   : customer
    Created on : 10-Nov-2018, 21:32:24
    Author     : georg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Page</title>
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
        <h2>Hello Customer</h2>
        </header>
    <body>
        <div class="centre">
          <h1>   <%
            if ( request.getAttribute("message")!=null) {
                out.println(request.getAttribute("message"));
                
            }
        %> </h1>
        <form>
        <p />
            User options <br />
            <input type="radio" name="tbl" value="RequestCab">Request Cab<br />
            <input type="radio" name="tbl" value="Update">Password Change<br />
            <input type="radio" name="tbl" value="UserDetails">View Your Details<br />
            <input type=submit value="Action">  </form>  <form method="POST" action="Logout.do"><input type="submit" value="Logout"/><br />
            
        </form> 
            <div/>
        
    </body>
</html>
