
import java.time.LocalDateTime; // автоматически добавляются
import java.time.format.DateTimeFormatter;

// Настроить проект, вывести в консоль “Hello world!”.
// Вывести в консоль системные дату и время.






class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, world!"); // Добавления вывода строки в консоль

        LocalDateTime now = LocalDateTime.now ();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.YYYY HH:mm:ss"); // класс добавления даты и время 
        System.out.println(formatter.format(now));
    }
}
