<%-- 
    Document   : driver
    Created on : 10-Nov-2018, 21:31:49
    Author     : georg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Driver Page</title>
    </head>
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
     <header>
       <h2>Welcome driver!</h2>
        </header>
    <body>
         <div class="centre">
       
          <h2>   
          <%! int i=0;
                String str=""; 
                String url = "";
          %>
          <%
 
            if((String)request.getAttribute("qry") !="No users") {
//            if (request.getAttribute("qry")){
                str="Driver"; 
                url = "DriverDetails.do";
            }
            if ((String)request.getAttribute("journeyquery") !="No journeys") {
//                str="driverJourney"; 
                url = "DriverJourneys.do";
            }
            if ((String)request.getAttribute("dpwqry") !="No journeys") {
//                str="driverJourney"; 
                url = "DriverJourneys.do";
            }
//            else{
//                url="";
//            }
//            else if (request.getAttribute("message")!=null) {
//                out.println(request.getAttribute("message"));  
//            }
        %> 
          </h2>
          <form method="POST" action="<%=url%>">
              
        <p />
            Driver Details <br />
            <input type="radio" name="tbl" value="jobDone">Completed journeys<br />
            <input type="radio" name="tbl" value="Update">Password Change<br />
            <input type="radio" name="tbl" value="UserDetails">View Your Details<br />
            <input type=submit value="Action">
          </form>  
          
          
          <form method="POST" action="Logout.do"><input type="submit" value="Logout"/><br />
        </form> 
            <div/>
            
        <%
            if (i++>0 && request.getAttribute("message")!=null) {
                out.println(request.getAttribute("message"));
                i--;
            }
        %>
    </body>
</html>
