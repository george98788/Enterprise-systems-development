<%-- 
    Document   : turnover
    Created on : 04-Dec-2018, 23:09:27
    Author     : georg
--%>

<%@page import="model.Jdbc"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Turnover Page</title>
    </head>
    <body>
        <h1>Turnover Page!</h1>
        <form method="POST" action="turnover.do">
    <td>Date:</td>
    <td>
        <input type="text" name="date" placeholder="YYYY-MM-DD"/>
    </td>
      <button type="submit" value="Submit" class="btn btn-success">Submit</button>
    </form>

        <form method="POST" action="turnover.do">
                <tr>
                    <td>Daily Turnover : £</td>
                        <td>
                             <%=(request.getAttribute("Turnover2"))%>
        </form>
                        <td>All Daily Invoices Below</td>
                 <div class="row justify-content-md-center">
                <h3>Receipts</h3><br><br>
                <table>
                    <tr>
                        <td>Journey ID: </td>
                    </tr>
                    <tr>
                        <td>Distance:</td>
                    </tr>
                    <tr>
                        <td>Date:</td>
                    </tr>
                    <tr>
                        <td>Time:</td>
                    </tr>
                    <tr>
                        <td>Driver Id: </td>
                    </tr>
                    <tr>
                        <td>Starting Point:   </td>
                    </tr>
                    <tr>
                        <td>Price (Inc. Tax):   </td>
                    </tr>
                      
                </table>
                <%=(String)(request.getAttribute("Turnover"))%>
                 </div>
          </form>
         
</body>
</html>
