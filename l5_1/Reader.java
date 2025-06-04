package l5_1;

public interface Reader extends PersonInterface {
    void takeBook(Administrator admin, String nameBook);

    void returnBook(Administrator admin, String nameBook);
}
