package l3_2;

class Author {
    public String Name;
    public String Surname;
    public int AuthorYear;
    public Author(String Name, String Surname, int AuthorYear) {
        this.Name = Name;
        this.Surname = Surname;
        this.AuthorYear=AuthorYear;
    }
    public String toString() {
        return "Автор: имя " + Name + " фамилия " + Surname +" год рождения " + AuthorYear;
    }
}