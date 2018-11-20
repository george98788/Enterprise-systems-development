<%-- 
    Document   : customer
    Created on : 10-Nov-2018, 21:32:24
    Author     : georg
--%>

<%@page import="model.Jdbc"%>
<%@page import="model.UserObject"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Page</title><%
            UserObject userObject = (UserObject) session.getAttribute("user");
            Jdbc jdbc = (Jdbc) session.getAttribute("dbbean");
            if (jdbc.role(userObject.getUsername(), userObject.getPassword()) == "driver" ) {
                request.getRequestDispatcher("/WEB-INF/conErr.jsp").forward(request, response);
            }
        %>
    </head>

    <body>
        <nav class ="navbar navbar-inverse bg-dark">
            <a class="navbar-brand" href="/Minicab/login.jsp">Log in</a>
            <a class="navbar-brand" href="/Minicab/register.jsp">Register</a>
            <a class="navbar-brand" href="/Minicab/driver.jsp">Driver</a>
            <a class="navbar-brand" href="/Minicab/customer.jsp">Customer</a>
        </nav>
        <header>
            <h2>Hello Customer</h2>
        </header>
        <div class="centre">
            <h1>   <%
                if (request.getAttribute("message") != null) {
                    out.println(request.getAttribute("message"));

                }
                %> </h1>


            <form method="POST" action="CustomerServlet.do">

                User options <br/>
                <input type="radio" name="tbl" value="RequestCab">Request Cab<br/>
                <input type="radio" name="tbl" value="Update">Password Change<br/>
                <input type="radio" name="tbl" value="UserDeatils">View Your Details<br/>
                <input type=submit value="Action">  </form>  <form method="POST" action="Logout.do"><input type="submit" value="Logout"/><br />

            </form> 
            <div/>

    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

</html>
