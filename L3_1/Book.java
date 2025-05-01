package L3_1;

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