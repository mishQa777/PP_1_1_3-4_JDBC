package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private static final UserService USER_SERVICE = new UserServiceImpl();
    private static final User user1 = new User("Oleg", "Tinkov", (byte) 54);
    private static final User user2 = new User("Vladimir", "Putin", (byte) 69);
    private static final User user3 = new User("Arnold", "Schwarzenegger", (byte) 74);
    private static final User user4 = new User("Zaur", "Tregulov", (byte) 34);

    public static void main(String[] args) {

            USER_SERVICE.createUsersTable();
            USER_SERVICE.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
            USER_SERVICE.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
            USER_SERVICE.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
            USER_SERVICE.saveUser(user4.getName(), user4.getLastName(), user4.getAge());
            USER_SERVICE.getAllUsers().toString();
            USER_SERVICE.cleanUsersTable();
            USER_SERVICE.dropUsersTable();


    }
}
