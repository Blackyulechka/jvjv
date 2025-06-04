package L3_1;

public class Main3_1 {
    public static void main(String[] args) {
        Book book1 = new Book("Война и Мир", "Лев Толстой", 4325, 1869);
        Book book2 = new Book("Преступление и наказание", "Фёдор Достоевский", 608, 1866);
        System.out.println("Узнаем, в одном ли году были выпущены книги Война и Мир, Преступление и наказание  -  " + book1.isSame(book2));
    }
}