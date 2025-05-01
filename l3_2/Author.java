package l3_2;

class Author {
    public String name;
    public String Surname;
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