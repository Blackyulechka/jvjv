package L7_3;

public class Main7_3 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        Contact veronika = new Contact("Мама", "+79213173790");
        Contact dima = new Contact("Дима", "+79532944200");
        Contact anton = new Contact("Антон", "+78125390146");

        phoneBook.createGroup("Друзья");
        phoneBook.createGroup("Работа");
        phoneBook.createGroup("Семья");

        phoneBook.addContactToGroup(veronika, "Друзья");
        phoneBook.addContactToGroup(veronika, "Семья");
        phoneBook.addContactToGroup(dima, "Друзья");
        phoneBook.addContactToGroup(anton, "Работа");
        phoneBook.addContactToGroup(anton, "Работа");

        phoneBook.printAllGroups();

        System.out.println("Найденный контакт по группе: " + phoneBook.getContactsByGroup("Друзья"));

        String searchPhone = "+79213173790";
        Contact foundContact = phoneBook.getContactByPhone(searchPhone);
        System.out.println("Найденный контакт по тел: " + foundContact);
    }
}