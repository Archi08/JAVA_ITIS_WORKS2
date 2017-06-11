package ru.itis.main;

import ru.itis.main.context.AppContext;
import ru.itis.main.dao.*;
import ru.itis.main.dao.jdbc.UsersDaoJdbcImpl;
import ru.itis.main.models.Auto;
import ru.itis.main.models.User;
import ru.itis.main.services.UsersService;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        AppContext context = new AppContext();
        UsersDao usersDao = context.getComponent(UsersDao.class);
        List<User> users = usersDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
