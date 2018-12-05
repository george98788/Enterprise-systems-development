<%-- 
    Document   : testdest
    Created on : 03-Dec-2018, 14:27:36
    Author     : georg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="POST" action="Maps2.do">
                    <div class="col-md-12 col-md-offset-5">
                        <h3> Please provide your following details </h3>
                    </div>
                    <br/>
                    <div class="col-md-10 col-md-offset-5">
                        <table>
                            <tr>
                                <td>Destination:</td>
                                <td><input type="text" name="des" placeholder="Destination" /></td>
                            </tr>
                            <tr>
                                <td>Destination:</td>
                                <td>
                                    <input type="text" name="des2" placeholder="Destination" />
                                </td>
                            </tr>
                             <tr>
                                <td>Date:</td>
                                <td>
                                    <input type="date" name="date"/>
                                </td>
                            </tr>
                             <tr>
                                <td>Time:</td>
                                <td>
                                    <input type="time" name="time"/>
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
    </body>
</html>
