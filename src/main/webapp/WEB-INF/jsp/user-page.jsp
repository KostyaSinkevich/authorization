<%@ page contentType="text/html;charset=UTF-8" language="java" import="by.itacademy.course.model.User" %>
<%@ page import="java.io.PrintWriter" %>
<html>
<head>
    <title>User page</title>
</head>
<body>

    Hello
    <%
        User someUser = (User) request.getAttribute("user");
        if (someUser == null) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/authorization.jsp");
            requestDispatcher.forward(request, response);
        } else {
            PrintWriter printWriter = response.getWriter();
            printWriter.println(someUser.getName());
        }
    %>

</body>
</html>
