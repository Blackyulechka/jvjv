package l3_2;

class Book {
    public String name;
    public Author author;
    public int pages;
    public int year;

    public Book(String name, Author author, int pages, int year) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.year = year;
    }

    public String toString() {
        return "Название: " + name + ", Автор: " + author + " Страниц: " + pages + " Год выпуска: " + year;
    }

    public boolean isSame(Book Mybook) {
        return this.year == Mybook.year;
    }

    public boolean isSameYear(Author yearAuthor) {
        return this.year == yearAuthor.authorYear;
    }

}