import java.util.Scanner; // Обязательно подключаем сканер!

public class Task5 {
    public static void main(String[] args) {
        // 1. Создаем сканер, который будет читать то, что мы пишем в консоли
        Scanner scanner = new Scanner(System.in);

        System.out.print("Сколько чисел вы хотите ввести? ");
        int count = scanner.nextInt(); // Считываем количество чисел

        int sum = 0;       // Переменная для суммы (начинаем с 0)
        int product = 1;   // Переменная для произведения (начинаем с 1!)

        System.out.println("Введите " + count + " чисел:");

        // 2. Запускаем цикл, чтобы спросить каждое число
        for (int i = 1; i <= count; i++) {
            System.out.print("Число " + i + ": ");
            int currentNumber = scanner.nextInt(); // Считываем само число

            // 3. Добавляем число к сумме и умножаем наше произведение
            sum = sum + currentNumber;      // Можно записать короче: sum += currentNumber;
            product = product * currentNumber; // Можно записать короче: product *= currentNumber;
        }

        // 4. Выводим результаты
        System.out.println("-------------------------");
        System.out.println("Сумма всех чисел: " + sum);
        System.out.println("Произведение всех чисел: " + product);

        scanner.close(); // Закрываем сканер (хороший тон в программировании)
    }
}