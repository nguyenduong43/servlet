<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/login" method="post">
    <div class="login">
        <h2>Login</h2>
        <input type="text" name="username" size="30" placeholder="ten dang nhap">
        <br>
        <input type="text" name="password" size="30" placeholder="mat khau">
        <br>
<%--        <button type="button">Sign in</button>--%>
        <input type="submit" value="Sign in">
    </div>
</form>
</body>
</html>