<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/02/2026
  Time: 2:07 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/converter">
    <div class="converter">
        <label>Rate</label>
        <input type="text" name="rate">
        <br>
        <label>USD</label>
        <input type="text" name="usd">
        <br>
        <input type="submit" value="Chuyen doi">
        <h2>${usd} USD = ${vnd} VND</h2>
    </div>
</form>
</body>
</html>
