<%-- 
    Document   : driver
    Created on : 10-Nov-2018, 21:31:49
    Author     : georg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Driver Page</title>
    </head>
     
      <body>
         <nav class ="navbar navbar-inverse bg-dark">
            <a class="navbar-brand" href="/Minicab/login.jsp">Log in</a>
            <a class="navbar-brand" href="/Minicab/register.jsp">Register</a>
            <a class="navbar-brand" href="/Minicab/driver.jsp">Driver</a>
            <a class="navbar-brand" href="/Minicab/customer.jsp">Customer</a>
        </nav>
          
           <%! ;
            String str="Action"; 
            String url = "Update.do";
        %>
         
         
            <div class="row justify-content-md-center">  
        <header>
        <h2>Driver View</h2>
        </header>
            </div>
        
                <div class="row justify-content-md-center">
          <h2>   <%
            if ( request.getAttribute("message")!=null) {
                out.println(request.getAttribute("message"));
                
            }
        %> </h2>
        <form>
        <p />
          <div class="center">
            <h3>Driver details</h3>
         </div>
        <input type="radio" name="tbl" value="jobDone">Completed journeys<br />
            <input type="radio" name="tbl" value="Update">Password Change<br />
            <input type="radio" name="tbl" value="UserDetails">View Your Details<br />
            
           
      
            </div>
        <div class="row justify-content-md-center">
            <button type="submit" value="Action" class="btn btn-outline-success">Submit</button>
            
              <form method="POST" action="Logout.do">
                 
                  <button type="submit" value="Logout" class="btn btn-outline-danger">Log Out</button>
             </div>
            <br /></form>
          </form> 
        </div>
          </div>  
          </div>
      
    </body>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

</html>
