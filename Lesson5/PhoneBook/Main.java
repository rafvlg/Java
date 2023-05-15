package Lesson5.PhoneBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<String>(Arrays.asList(
            "Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова",
            "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
            "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова",
            "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"));

        HashMap<String, Integer> nameCounts = new HashMap<String, Integer>();
        for (String employee : employees) {
            String name = employee.split(" ")[0];
            Integer count = nameCounts.get(name);
            if (count == null) {
                count = 0;
            }
            nameCounts.put(name, count + 1);
        }

        ArrayList<Map.Entry<String, Integer>> sortedNameCounts = new ArrayList<Map.Entry<String, Integer>>(nameCounts.entrySet());
        Collections.sort(sortedNameCounts, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                return e2.getValue().compareTo(e1.getValue());
            }
        });

        for (Map.Entry<String, Integer> entry : sortedNameCounts) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " повторений");
            }
        }
    }
}
