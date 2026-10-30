import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task6 {
    public static void main(String[] args) {

        String lastName = "Петров";
        LocalDateTime startTime = LocalDateTime.of(2026, 10, 29, 16, 48);
        LocalDateTime endTime = LocalDateTime.now();

        // 4. Создаем красивый формат для вывода (День.Месяц.Год Часы:Минуты)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        // 5. Выводим все на консоль
        System.out.println("=== ОТЧЕТ О ВЫПОЛНЕНИИ ЗАДАНИЯ ===");
        System.out.println("Фамилия разработчика: " + lastName);
        System.out.println("Время получения задания: " + startTime.format(formatter));
        System.out.println("Время сдачи задания:     " + endTime.format(formatter));
    }
}