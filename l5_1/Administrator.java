package l5_1;

public interface Administrator extends PersonInterface {
    void findAndGiveBook(Reader reader, String nameBook);

    void toWarn(Reader reader, String nameBook);
}
