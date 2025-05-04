package l3_2;

class Book{
    public String Name;
    public Author author;
    public int Pages;
    public int Year;
    public Book(String Name, Author author, int Pages, int Year){
        this.Name=Name; this.author=author; this.Pages=Pages; this.Year=Year;
    }
    public String toString(){
        return "Название: "+ Name + ", Автор: "+ author+" Страниц: " + Pages+ " Год выпуска: " + Year;
    }
    public boolean same(Book Mybook){
        return this.Year == Mybook.Year;
    }
    public boolean same_year(Author year_a) {
        return this.Year == year_a.AuthorYear;
    }

}