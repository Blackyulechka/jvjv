package L7_3_2;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MissedCall {
    private Map<LocalDateTime, String> missedCalls = new TreeMap<>();

    public void addMissedCall(String phoneNumber){
        missedCalls.put(LocalDateTime.now(),phoneNumber);
    }
    public void printMissedCalls(PhoneBook phoneBook){
        System.out.println("Вывод пропущенных звонков:");
        for (Map.Entry<LocalDateTime,String> m: missedCalls.entrySet()){
            Contact contact = phoneBook.getContactByPhone(m.getValue());
            String callerInfo = (contact != null) ? contact.getName() : m.getValue();
            System.out.println(m.getKey() + " - " + callerInfo);
        }
    }
}
