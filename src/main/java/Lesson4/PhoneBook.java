package Lesson4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    HashMap<String, String> phoneBook = new HashMap<String, String>();

    public void add(String phoneNumber, String surname) {
        this.phoneBook.put(phoneNumber, surname);
    }

    public HashMap<String, String> getPhoneBook() {
        return phoneBook;
    }

    public String get(String desiredSurname) {
        Set<Map.Entry<String, String>> entrySet = this.phoneBook.entrySet();
        String result = "";
        for (Map.Entry<String, String> pair : entrySet) {
            if (desiredSurname.equals(pair.getValue())) {
                result = result +" "+ pair.getKey();// нашли наше значение и возвращаем  ключ
            }
        }
        return result;
    }



}
