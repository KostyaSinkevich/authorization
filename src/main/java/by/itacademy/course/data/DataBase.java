package by.itacademy.course.data;

import by.itacademy.course.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private static List<User> userList;

    public static List<User> getUserList() {
        if (userList == null) {
            userList = new ArrayList<>();
        }
        return userList;
    }
}
