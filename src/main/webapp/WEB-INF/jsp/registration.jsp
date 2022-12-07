<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<form action="/registration" method="post">
    <label>
        Enter your name:
        <input type="text" name="name" value="">
    </label> <br />
    <label>
        Create a login:
        <input type="text" name="login" value="">
    </label> <br />
    <label>
        Create a password:
        <input type="password" name="password" value="">
    </label> <br />
    <input type="submit" value="Register"> <br />
    If you already have an account press <a href="/authorization">here</a>
</form>
</body>
</html>
