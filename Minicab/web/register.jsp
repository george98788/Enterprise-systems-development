<%-- 
    Document   : register
    Created on : 11-Nov-2018, 16:59:58
    Author     : georg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <form method="POST" action="CustomerRegistration.do">     
            <table>
                <tr>
                    <th></th>
                    <th>Please provide your following details</th>
                </tr>
                <tr>
                    <td>Full name:</td>
                    <td><input type="text" name="fullname" placeholder="Full Name" required/></td>
                </tr>
                <tr>
                    <td>House/Flat Number:</td>
                    <td><input type="text" name="houseNo" placeholder="House/Flat Number" required/></td>
                </tr>
                <tr>
                    <td>Street/Road Name:</td>
                    <td><input type="text" name="roadName" placeholder="Street/Road" required/></td>
                </tr>
                 <tr>
                    <td>City/Town name:</td>
                    <td><input type="text" name="cityName" placeholder="City/Town" required/></td>
                </tr>
                 <tr>
                    <td>Postal Code:</td>
                    <td><input type="text" name="postcode" placeholder="Postal Code" required/></td>
                </tr>
                <tr>
                    <td>Username:</td>
                    <td><input type="text" name="usernameReg" placeholder="Username" required/></td>
                </tr>
                  <tr>
                    <td>Password:</td>
                    <td><input type="password" name="passwordReg" placeholder="Password"required/></td>
                </tr>
                <tr> 
                    <td> <input type="submit" value="Login"/></td>
                         
                </tr>
                 </form>   
        <%
            if ( request.getAttribute("message")!=null) {
                out.println(request.getAttribute("message"));
              
            }
        %>
            </table>
        </form>   
    </form>   
</html>
