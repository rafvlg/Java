package Lesson3;

import java.util.Arrays;
import java.util.List;

public class HomeWork3 {
    private static double getAverage(List<Integer> list) {
        return list.stream()
                .mapToInt(a -> a)
                .average().orElse(0);
    }
 
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7, 2, 8, 4, 5);
 
        double avg = getAverage(list);
        System.out.println(avg);        
    }

    
}
