
import java.time.LocalTime;
import java.util.Scanner;

// Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
// Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

// В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида 
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

public class Name { // Блок для введения строки
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "866");
        System.out.printf("Введите Имя: ");
        LocalTime myTime = LocalTime.now(); 
        String name = iScanner.nextLine(); // Блок для приветсвия пользователя
        if (myTime.getHour() >= 5 && myTime.getHour() < 12) {  // Добавления
            System.out.printf("Доброе утро %s!", name);
        }
        else if (myTime.getHour() >= 12 && myTime.getHour() < 18) {
            System.out.printf("Доброе утро, %s!", name);
        }
        else if (myTime.getHour() >= 18 && myTime.getHour() < 22) {
            System.out.printf("Доброе день, %s!", name);
        }
        if (myTime.getHour() >= 22 && myTime.getHour() < 5){
            System.out.printf("Доброе вечер, %s!", name);
        }
        else {
            System.out.printf("Доброй ночи, %s!", name);
        }
        //System.out.println(myTime.getHour());
        iScanner.close();
    }
    
}
