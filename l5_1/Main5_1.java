public class Main5_1 {
     public static void main(String[] args){
        User Maria = new User ("Мария");
        User AdminAnna = new User ("Анна");
        User LibrarianOleg = new User ("Олег");
        User SupplierAnton = new User ("Антон");
        AdminAnna.FindAndGiveBook(Maria,"«Мы» Евгения Замятина");
        Maria.TakeBook(AdminAnna,"«Мы» Евгения Замятина");
        LibrarianOleg.OrderBook(SupplierAnton,"«Десять негритят» Агаты Кристи");
        SupplierAnton.BringBook(LibrarianOleg,"«Улисс» Джеймса Джойса");
        AdminAnna.ToWarn(Maria,"«Мы» Евгения Замятина");
        Maria.ReturnBook(AdminAnna,"«Мы» Евгения Замятина");
    }
}
