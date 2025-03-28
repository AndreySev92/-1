package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Nikita", "Doe", (byte) 25);
        userService.saveUser("Joe", "Fal", (byte) 43);
        userService.saveUser("Max", "Lolim", (byte) 42);
        userService.saveUser("Maxim", "Bars", (byte) 44);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
        Util.closeSessionFactory();



    }
}