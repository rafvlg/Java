// Дано четное число N (>0) и символы c1 и c2. 
// Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.

package Lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner nInputScanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int lensN = nInputScanner.nextInt();

        System.out.println("Введите c1: ");
        int numsC1 = nInputScanner.nextInt();

        System.out.println("Введите c2: ");
        int numsC2 = nInputScanner.nextInt();

        System.err.println(massiv(lensN, numsC1, numsC2));
    }
    public static String massiv(int a, int b, int c) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < a; i++) {
            if (i%2 == 0) str.append(b);
            else str.append(c);
        }
        return str.toString();
    }
}
