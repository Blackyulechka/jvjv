package L3_1;

class Book{
    public String Name;
    public String Author;
    public int Pages;
    public int Year;
    public Book(String Name, String Author, int Pages, int Year){
        this.Name=Name; this.Author=Author; this.Pages=Pages; this.Year=Year;
    }
    public String toString(){
        return "Название: "+ Name + ", Автор: " + Author +" Страниц: " + Pages + " Год выпуска: " + Year;
    }
    public boolean same(Book Mybook){
        return this.Year == Mybook.Year;
    }
}