package L6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the login...");
        String login = scanner.nextLine();
        System.out.println("Enter the password...");
        String password = scanner.nextLine();

        try {
            User users = getUserByLoginAndPassword(login, password);
            validateUser(users);
            System.out.println("Доступ предоставлен");
        } catch (UserNotFoundException | AccessDeniedException e) {
            System.out.println(e.getMessage());
        }

    }

    public static User[] getUsers() {
        User user1 = new User("John", "qwerty123", "john@email.com", 24);
        User user2 = new User("Henrik", "zxc123", "henrik@email.com", 16);
        User user3 = new User("Angela", "princess18", "angel@email.com", 18);
        return new User[]{user1, user2, user3};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (user.login.equals(login) && user.password.equals(password)) {
                return user;
            }
        }
        throw new UserNotFoundException(login);
    }

    public static void validateUser(User user) throws AccessDeniedException {
        int majorityAge = 18;
        if (user.age < majorityAge) {
            throw new AccessDeniedException(user.login, user.age);
        }
    }

}
