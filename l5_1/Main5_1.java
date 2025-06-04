package l5_1;

public class Main5_1 {
    public static void main(String[] args) {
        User Maria = new User("Мария");
        User AdminAnna = new User("Анна");
        User LibrarianOleg = new User("Олег");
        User SupplierAnton = new User("Антон");
        AdminAnna.findAndGiveBook(Maria, "«Мы» Евгения Замятина");
        Maria.takeBook(AdminAnna, "«Мы» Евгения Замятина");
        LibrarianOleg.orderBook(SupplierAnton, "«Десять негритят» Агаты Кристи");
        SupplierAnton.bringBook(LibrarianOleg, "«Улисс» Джеймса Джойса");
        AdminAnna.toWarn(Maria, "«Мы» Евгения Замятина");
        Maria.returnBook(AdminAnna, "«Мы» Евгения Замятина");
    }
}
