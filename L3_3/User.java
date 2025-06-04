package L3_3;

public class User {
    public String name;
    public String surname;
    public String email;
    public int id;
    public static int totalOnline = 0;

    public User(String name, String surname, String email, int id) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.id = id;
        totalOnline++;
    }
}

