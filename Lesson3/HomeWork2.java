
// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Введите длинну массива (n >= 2): ");
            n = sc.nextInt();
        } while (n < 2);
        int[] array = createRandomArray(n, 1, 9);
 
        System.out.println("Дан массив: " + Arrays.toString(array));
 
        int[] arrayZero = evenElementsMakeZero(Arrays.copyOf(array, array.length));
        System.out.println("Обнуляем чётные элементы: " + Arrays.toString(arrayZero));
 
        int[] arrayDelete = deleteEvenElement(Arrays.copyOf(array, array.length));
        System.out.println("Удаляем чётные элементы массива: " + Arrays.toString(arrayDelete));
    }
 
    //СОЗДАЁМ МАССИВ ЗАДАННОЙ ДЛИННЫ И ЗАПОЛНЯЕМ СЛУЧАЙНЫМИ ЧИСЛАМИ ОТ MIN ДО MAX (ВКЛЮЧИТЕЛЬНО)
    public static int[] createRandomArray(int length, int min, int max) {
        int[] result = length > 0 ? new int[length] : new int[0];
        if (length > 0) {
            Random rand = new Random();
            for (int index = 0; index < length; index++) {
                result[index] = rand.nextInt(Math.abs(max - min) + 1) + min;
            }
        }
        return result;
    }
 
    public static int[] evenElementsMakeZero(int[] array) {
        int index = 0;
        while (index < array.length) {
            array[index] = 0;
            index += 2;
        }
        return array;
    }
 
    public static int[] deleteEvenElement(int[] array) {
        int[] result = new int[array.length / 2];
        int index = 1;
        for (int i = 0; i < result.length; i++) {
            result[i] = array[index];
            index += 2;
        }
        return result;
    }
}
