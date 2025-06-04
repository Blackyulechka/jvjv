package l3_2;

class Author {
    public String name;
    public String surname;
    public int authorYear;

    public Author(String name, String surname, int authorYear) {
        this.name = name;
        this.surname = surname;
        this.authorYear = authorYear;
    }

    public String toString() {
        return "Автор: имя " + name + " фамилия " + surname + " год рождения " + authorYear;
    }
}