package l5_1;

class User implements Reader, Librarian, Supplier, Administrator {
    public String nameUser;

    public User(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getName() {
        return nameUser;
    }

    @Override
    public void takeBook(Administrator admin, String nameBook) {
        System.out.println("Читатель: " + nameUser + " берет книгу " + nameBook + " у админа ");
    }

    @Override
    public void returnBook(Administrator admin, String nameBook) {
        System.out.println("Читатель: " + nameUser + " вернул книгу " + nameBook + " админу ");
    }

    @Override
    public void orderBook(Supplier supplier, String nameBook) {
        System.out.println("Библиотекарь " + nameUser + " заказал книгу " + nameBook + " у поставщика " + supplier.getName());
    }

    @Override
    public void bringBook(Librarian librarian, String nameBook) {
        System.out.println("Поставщик " + nameUser + " принес книгу " + nameBook + " библиотекарю " + librarian.getName());
    }

    @Override
    public void findAndGiveBook(Reader reader, String nameBook) {
        System.out.println("Администратор  " + nameUser + " нашел и выдал книгу " + nameBook + " читателю " + reader.getName());
    }

    @Override
    public void toWarn(Reader reader, String nameBook) {
        System.out.println("Предупреждение!");
        System.out.println("На книгу " + nameBook + " задолженность у читателя " + reader.getName());
    }
}
