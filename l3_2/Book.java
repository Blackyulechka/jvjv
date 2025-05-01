package l3_2;

class Book{
    public String Name;
    public Author author;
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