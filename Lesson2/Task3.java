// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, 
// который запишет эту строку в простой текстовый файл, обработайте исключения.

package Lesson2;

import java.io.File;
import java.io.FileWriter;

public class Task3 {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder();
        
    }
    public static String buildString (int a, String b) {
        StringBuilder textResult = new StringBuilder();
        for (int i = 0; i < a; i++) {
            textResult.append(b);
        }
        return textResult.toString();
    }
    public static void writeToFile (String args) {
        try {
            FileWriter writer = new FileWriter("text.txt");
            writer.append(args);
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }
}




// /* Задача 4.
//  * Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
//  * который запишет эту строку в простой текстовый файл, обработайте исключения.
//  */

//  package Java_Seminar2_Classwork;

//  import java.io.FileWriter;
//  import java.io.IOException;
 
//  public class Java_Seminar2_CW_Task4 {
//      public static void main(String[] args) {
//          String text = "TEXT";
//          int repeat = 100;
//          String result = strRepeat(text, repeat);
//          System.out.println(result);
//          writeToFile(result);
//      }
 
//      private static String strRepeat(String word, int count) {
//  //        StringBuilder result = new StringBuilder();
 
//  //        result.append(word.repeat(count)); // Эквивалент умножения строк, как для Python.
 
//  //        result.append(String.valueOf(word).repeat(Math.max(0, count)));
//  //
//  //        for (int i = 0; i < count; i++) {
//  //            result.append(word);
//  //        }
//  //        return result.toString();
//          return word.repeat(count);
//      }
 
//      private static void writeToFile(String text) {
//          try (FileWriter writer = new FileWriter("text.txt")) { // autoclosable
//              writer.append(text);
//          } catch (IOException ex) {
//              System.out.println("Ошибка записи в файл.");
//          }
 
//  //        FileWriter writer = null;
//  //        try {
//  //            writer = new FileWriter("file.txt");
//  //            writer.append(text);
//  //        } catch (IOException ex) {
//  //            System.out.println("Ошибка записи в файл.");
//  //        } finally {
//  //            assert writer != null;
//  //            try {
//  //                writer.close();
//  //            } catch (IOException ex) {
//  //                System.out.println("Ошибка закрытия файла.");
//  //            }
//  //        }
//      }
//  }
