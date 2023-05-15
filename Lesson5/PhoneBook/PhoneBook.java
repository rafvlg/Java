package Lesson5.PhoneBook;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<String, ArrayList<String>>();
    }

    public void addContact(String name, String phone) {
        ArrayList<String> phones = phoneBook.get(name);
        if (phones == null) {
            phones = new ArrayList<String>();
            phoneBook.put(name, phones);
        }
        phones.add(phone);
    }

    public ArrayList<String> getPhones(String name) {
        return phoneBook.get(name);
    }
}


