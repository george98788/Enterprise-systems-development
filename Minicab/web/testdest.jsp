<%-- 
    Document   : testdest
    Created on : 03-Dec-2018, 14:27:36
    Author     : georg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%@include  file="WEB-INF/newbar.html" %>
    <body>
        
        <div class="row justify-content-md-center">
        <form method="POST" action="Maps.do">
                    <div class="col-md-12 col-md-offset-5">
                        <h3> Please provide your following details </h3>
                    </div>
                    <br/>
                    <div class="col-md-10 col-md-offset-5">
                        <table>
                            <tr>
                                <td>Destination: </td>
                                <td><input type="text" name="des" placeholder="Destination" /></td>
                            </tr>
                            <tr>
                                <td>Destination: </td>
                                <td>
                                    <input type="text" name="des2" placeholder="Destination" />
                                </td>
                            </tr>
                        </table>
                    </div>
                    <div class="row">
                        <div class="col-md-10 col-md-offset-5">
                            <div class="text-center">
                                <button type="submit" value="submit" class="btn btn-success">Submit</button>
                                
                            </div>
                        </div>
                    </div>
                </form>
        </div>
    </body>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

</html>
