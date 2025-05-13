package L7_3_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<Contact>> groups = new HashMap<>();

    public void createGroup(String groupName) {
        if (!groups.containsKey(groupName)) {
            groups.put(groupName, new ArrayList<>());
        }
    }

    public void addContactToGroup(Contact contact, String groupName) {
        createGroup(groupName);
        List<Contact> groupContacts = groups.get(groupName);
        if (!groupContacts.contains(contact)) {
            groupContacts.add(contact);
        }
    }

    public List<Contact> getContactsByGroup(String groupName) {
        if (groups.containsKey(groupName)) {
            return groups.get(groupName);
        }
        return new ArrayList<>();
    }

    public Contact getContactByPhone(String phoneNumber) {
        for (List<Contact> group : groups.values()) {
            for (Contact contact : group) {
                if (contact.getNumber().equals(phoneNumber)) {
                    return contact;
                }
            }
        }
        return null;
    }

    public void printAllGroups() {
        System.out.println("Вся телефонная книжка:");
        for (Map.Entry<String, List<Contact>> entry : groups.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
