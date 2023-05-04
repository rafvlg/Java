package Lesson3;

import java.util.ArrayList;

// Cоздать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа. 
// Пройти по списку, найти и удалить целые числа.
public class Task2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<String>();
        list.add("Hello");
        list.add(25);
        list.add("world");
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer) list.remove(i--);
        }
        System.out.println(list);
            
    }
}
