package by.itacademy.course.servlet;

import by.itacademy.course.dao.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegistrationController extends HttpServlet {

    private final UserDao userDao = new UserDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/jsp/registration.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String name = req.getParameter("name");
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        req.setAttribute("user", userDao.addNewUser(name, login, password));

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/jsp/user-page.jsp");
        requestDispatcher.forward(req, resp);
    }
}
