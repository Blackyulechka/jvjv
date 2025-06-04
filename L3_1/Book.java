package L3_1;

class Book {
    public String name;
    public String author;
    public int pages;
    public int year;

    public Book(String Name, String Author, int Pages, int Year) {
        this.name = Name;
        this.author = Author;
        this.pages = Pages;
        this.year = Year;
    }

    public String toString() {
        return "Название: " + name + ", Автор: " + author + " Страниц: " + pages + " Год выпуска: " + year;
    }

    public boolean isSame(Book Mybook) {
        return this.year == Mybook.year;
    }
}