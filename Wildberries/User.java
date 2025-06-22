package Wildberries;

public class User {
    private int id;
    private int sale;

    public User(int id, int sale) {
        this.id = id;
        this.sale = sale;
    }

    public int getId() {
        return id;
    }

    public int getSale() {
        return sale;
    }
}
