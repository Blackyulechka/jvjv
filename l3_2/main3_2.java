package l3_2;

public class main3_2 {
    public static void main(String[] args) {
        Author Tolstoy = new Author("Лев", "Толстой", 1821);
        Author Dostoevsky = new Author("Фёдор", "Достоевский", 1821);
        Book book1 = new Book("Война и Мир", Tolstoy, 4325, 1869);
        Book book2 = new Book("Преступление и наказание", Dostoevsky, 608, 1866);
        System.out.println("Год выпуска 'Войны и мир' совпадает с годом рождения Достоевского? -  " + book1.isSameYear(Dostoevsky));
    }
}