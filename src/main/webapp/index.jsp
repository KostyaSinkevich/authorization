<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Authorization</title>
</head>
<body>
<form action="/authorization" method="post">
    <label>
        Login:
        <input type="text" name="login" placeholder="Enter your login">
    </label> <br />
    <label>
        Password:
        <input type="password" name="password" placeholder="Enter your password">
    </label> <br />
    <input type="submit" value="Log in"> <br />
    If you don't have an account press <a href="/registration">here</a>
</form>
</body>
</html>
