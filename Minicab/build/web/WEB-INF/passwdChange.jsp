<%-- 
    Document   : passwdChange
    Created on : 11-Mar-2016, 01:02:16
    Author     : me-aydin
--%>

<%@page import="model.UserObject"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change Password</title>
    </head>
    <body>
        <h2>Password change</h2>
        <form method="POST" action="Update.do">     
            <table>
                <tr>
                    <th></th>
                    <th>Please provide your following details</th>
                </tr>
                <tr>
                    <td> User:          <%
                        if (session.getAttribute("user") != null) {  
                         UserObject userObject = (UserObject) session.getAttribute("user");
                         out.println(userObject.getUsername());
                         
                        }%> </td>

                </tr>
                <tr>
                    <td>New Password:</td>
                    <td><input type="password" name="password"/></td>
                </tr>
                <tr>
                    <td>Confirm Password:</td>
                    <td><input type="password" name="newpasswd"/></td>
                </tr>
                <tr> 
                    <td> <input type="submit" value="Change"/></td>
                </tr>
            </table>
        </form>
        <%=((String) (request.getAttribute("msg")) != null) ? (String) (request.getAttribute("msg")) : ""%>
        <jsp:include page="foot.jsp"/>
    </body>
</html>