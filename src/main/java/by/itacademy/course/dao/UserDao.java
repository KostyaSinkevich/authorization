package by.itacademy.course.dao;

import by.itacademy.course.data.DataBase;
import by.itacademy.course.exception.InvalidUserDataInputException;
import by.itacademy.course.model.User;

public class UserDao {

    public User get(String login, String password) {

        try {
            for (User user : DataBase.getUserList()) {
                if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                    return user;
                }
            }
            throw new InvalidUserDataInputException();
        } catch (InvalidUserDataInputException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void save(User user) {
        DataBase.getUserList().add(user);
    }

    public User addNewUser(String name, String login, String password) {
        User user = new User();
        user.setName(name);
        user.setLogin(login);
        user.setPassword(password);
        save(user);
        return user;
    }

}
