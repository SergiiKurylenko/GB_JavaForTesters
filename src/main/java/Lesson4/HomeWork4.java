package Lesson4;

import java.util.*;
import java.util.stream.Collectors;

public class HomeWork4 {
    public static void main(String[] args) {
        List<String> listOfWorlds = new ArrayList<>(Arrays.asList("Один","Два","Три","Четыре","Пять","Шесть",
                "Семь","Восем","Восем","Три","Один","Девять","Десять","Одинадцать","Два","Двенадцать"));

        System.out.println(listOfWorlds);
        System.out.println(uniqList(listOfWorlds));
        System.out.println(countList(listOfWorlds));

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("234-456-765", "Буратино");
        phoneBook.add("234-456-764", "Мальвина");
        phoneBook.add("234-456-763", "Пьеро");
        phoneBook.add("234-452-765", "Карабас-Барабас");
        phoneBook.add("231-456-765", "Буратино");

        System.out.println(phoneBook.getPhoneBook());
        System.out.println(phoneBook.get("Буратино"));
    }

    private static Map<Object, Long> countList(List<String> listOfWorlds) {
        Map<Object, Long> map =
                listOfWorlds.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        return map;
    }

    private static List<String> uniqList(List<String> listOfWorlds) {
        List<String> newList = new ArrayList<>();
        Set<String> set = new HashSet<>(listOfWorlds);
        newList.addAll(set);
        return newList;
    }
}
