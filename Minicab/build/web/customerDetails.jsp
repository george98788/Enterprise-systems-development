<%-- 
    Document   : customerDetails
    Created on : 20-Nov-2018, 16:59:31
    Author     : georg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Details</title>
    </head>
    <body>
    <%@include  file="WEB-INF/newbar.html" %>
        
    <div class="row justify-content-md-center">
        <h1>Customer Details!</h1>
    </div>
       <%! ;
                String str="CustomerDetails"; 
                String url = "CustomerServlet.do";
                %>
        <div class="row justify-content-md-center">
        <form method="POST" action="<%=url%>">
            <%=(String)(request.getAttribute("customerDetailsqry"))%>
        </form>
        </div>
        <br><br><br>
        <div class="row justify-content-md-center">
         <a href="register.jsp" class="btn btn-success">Register</a>
           <jsp:include page="WEB-INF/foot.jsp"/>
           </div> 
    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

</html>
