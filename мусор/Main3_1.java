import java.util.Scanner;
class Book{
    public String Name;
    public String Author;
    public int pages;
    public int year;
    public Book(String Name, String Author, int pages, int year){
        this.Name=Name; this.Author=Author; this.pages=pages; this.year=year;
    }
    public String toString(){
        return "Название: "+ Name + ", Автор: "+ Author+" Страниц: " +pages+ " Год выпуска: "+ year;
    }
    public boolean same(Book Mybook){
        return this.year == Mybook.year;
    }
}
public class Main3_1 {
    public static void main(String[] args) {
    Book book1 =new Book("Война и Мир","Лев Толстой", 4325, 1869);
    Book book2 =new Book("Преступление и наказание", "Фёдор Достоевский", 608, 1866);
    System.out.println("Узнаем, в одном ли году были выпущены книги Война и Мир, Преступление и наказание  -  " + book1.same(book2));
    }
}