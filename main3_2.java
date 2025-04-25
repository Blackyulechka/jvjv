import java.util.Scanner;
class Author {
    String name;
    String Surname;
    int Ayear;
    public Author(String name, String Surname, int Ayear) {
        this.name = name;
        this.Surname = Surname;
        this.Ayear=Ayear;
    }
    public String toString() {
        return "Автор: имя " + name + " фамилия " + Surname +" год рождения " + Ayear;
    }
}
class Book{
    String Name;
    Author author;
    int pages;
    int year;
    public Book(String Name, Author author, int pages, int year){
        this.Name=Name; this.author=author; this.pages=pages; this.year=year;
    }
    public String toString(){
        return "Название: "+ Name + ", Автор: "+ author+" Страниц: " +pages+ " Год выпуска: "+ year;
    }
    public boolean same(Book Mybook){
        return this.year == Mybook.year;
    }
    public boolean same_year(Author year_a) {
        return this.year == year_a.Ayear;
    }

}
public class main3_2 {
    public static void main(String[] args) {
        Author Tolstoy = new Author("Лев", "Толстой",1821);
        Author Dostoevsky = new Author("Фёдор", "Достоевский",1821);
        Book book1 =new Book("Война и Мир",Tolstoy, 4325, 1869);
        Book book2 =new Book("Преступление и наказание", Dostoevsky, 608, 1866);
        System.out.println("Год выпуска 'Войны и мир' совпадает с годом рождения Достоевского? -  "+ book1.same_year(Dostoevsky));
    }
}