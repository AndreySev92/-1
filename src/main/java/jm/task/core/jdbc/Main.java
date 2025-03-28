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
        userService.saveUser("Joe", "7A35090F", (byte) 43);
        userService.saveUser("Max", "Alderson", (byte) 42);
        userService.saveUser("Maxim", "Engressia", (byte) 44);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
        Util.closeSessionFactory();



    }
}