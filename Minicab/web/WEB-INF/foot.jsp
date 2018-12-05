<%-- 
    Document   : Foot
    Created on : 16-Nov-2015, 13:44:47
    Author     : me-aydin
--%>

<%@page import="model.Jdbc"%>
<%@page import="model.UserObject"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    
    String url = "";
    UserObject userObject = (UserObject) session.getAttribute("user");
    Jdbc jdbc = (Jdbc) session.getAttribute("dbbean");
            if (jdbc.role(userObject.getUsername(), userObject.getPassword()) == "customer" ) {
                url = "customer.jsp";
            }
            else if (jdbc.role(userObject.getUsername(), userObject.getPassword()) == "driver" ){
               
                url = "driver.jsp";
            } 
            else{
                url="adminView.jsp";
            }
    %>
        
<!--    <form method="POST" action="%=url%">
        
        <h6>Back to Main</h6>
    </form>-->
<body>
    <a href="<%=url%>"> Back to Main </a>
</body>
 
</html>