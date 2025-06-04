package L6;

public class UserNotFoundException extends Exception {
    private String login;

    public UserNotFoundException(String login) {
        super("Пользователь с логином '" + login + "' не найден");
        this.login = login;
    }

}
