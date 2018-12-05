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
        <input type="date" name="date"/>
    </td>
      <button type="submit" value="Submit" class="btn btn-success">Submit</button>
    </form>
</body>
</html>
