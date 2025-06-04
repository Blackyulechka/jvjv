package L6;

public class AccessDeniedException extends Exception {
    private String userName;
    private int userAge;

    public AccessDeniedException(String userName, int userAge) {
        super("Доступ запрещён для пользователя '" + userName + "' из-за возраста: " + userAge);
        this.userName = userName;
        this.userAge = userAge;
    }
}
