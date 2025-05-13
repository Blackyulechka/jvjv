package L7_3_2;

import static java.lang.Thread.sleep;

public class Main7_3_2 {
    public static void main(String[] args) throws InterruptedException {
        PhoneBook phoneBook = new PhoneBook();

        Contact yulia = new Contact("Юлия", "+79216837017");
        Contact anton = new Contact("Антон", "+79219381254");
        phoneBook.createGroup("Друзья");
        phoneBook.addContactToGroup(yulia, "Друзья");
        phoneBook.addContactToGroup(anton, "Друзья");

        MissedCall missedCalls = new MissedCall();
        missedCalls.addMissedCall("+79216837017");
        sleep(1000);
        missedCalls.addMissedCall("+79219381254");
        sleep(1000);
        missedCalls.addMissedCall("+79123456789");

        missedCalls.printMissedCalls(phoneBook);
    }
}
