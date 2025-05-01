class User implements Reader,Librarian,Supplier,Administrator {
    String NameUser;
    public User(String NameUser) {
        this.NameUser = NameUser;
    }
    public String getName() {
        return NameUser;
    }
    @Override
    public void TakeBook(Administrator admin, String NameBook ){
        System.out.println("Читатель: "+ NameUser +" берет книгу "  + NameBook + " у админа ");
    }
    @Override
    public void ReturnBook(Administrator admin, String NameBook ){
        System.out.println("Читатель: "+ NameUser +" вернул книгу "  + NameBook + " админу " );
    }
    @Override
    public void OrderBook(Supplier supplier,String NameBook){
        System.out.println("Библиотекарь "+ NameUser +" заказал книгу "  + NameBook + " у поставщика " + ((User)supplier).getName());
    }
    @Override
    public void BringBook(Librarian librarian, String NameBook){
        System.out.println("Поставщик "+ NameUser + " принес книгу "+ NameBook + " библиотекарю " + ((User)librarian).getName());
    }
    @Override
    public void FindAndGiveBook(Reader reader,String NameBook){
        System.out.println("Администратор  "+ NameUser + " нашел и выдал книгу "+ NameBook + " читателю " + ((User)reader).getName());
    }
    @Override
    public void ToWarn(Reader reader,String NameBook){
        System.out.println("Предупреждение!");
        System.out.println("На книгу "+ NameBook + " задолженность у читателя " + ((User)reader).getName());
    }
}
