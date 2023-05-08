
// Реализовать консольное приложение, которое в цикле:
// Принимает от пользователя строку вида 
// text~num
// Нужно разделить строку по ~, сохранить text в связный список на позицию num.
// Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

package Lesson4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "866");
    

        List<String> inpuList = new LinkedList<>();
        String[] tempArr = new String[2];
        while (true) {
            System.out.println("Введите строку вида text~num для окончания ввода нажмите Enter: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            if (input.contains("~")) {

                tempArr = input.split("~"); 
                int num = Integer.parseInt(tempArr[1]); 
                if (tempArr[0].equals("print")) {
                    if (num > 0 && num <= inpuList.size()) {
                        System.out.println(inpuList.get(num));
                        inpuList.remove(num);
                        System.out.println(inpuList);
                    }
                    else{
                        System.out.println("Ошибка, индекс выходит за диапазон");
                    }
                    
                }
                else {

                if (num > inpuList.size()) {
                    System.out.println("Введен слишком большой индекс, будет добавлен в конец списка");
                    num = inpuList.size();
                }
                if (num < 0) {
                    System.out.println("Введен отрицательный индекс");
                    num = 0;
                    
                }
                inpuList.add(num, tempArr[0]);
                System.out.println(inpuList);     
            }              
            } else
                System.out.println("Ошибка");

            
        }

    }

    
}