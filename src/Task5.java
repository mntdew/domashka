import java.util.Scanner; // Обязательно подключаем сканер!

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Сколько чисел вы хотите ввести? ");
        int count = scanner.nextInt();

        int sum = 0;
        int product = 1;
        System.out.println("Введите " + count + " чисел:");

        for (int i = 1; i <= count; i++) {
            System.out.print("Число " + i + ": ");
            int currentNumber = scanner.nextInt();

            sum = sum + currentNumber;
            product = product * currentNumber;
        }

        System.out.println("-------------------------");
        System.out.println("Сумма всех чисел: " + sum);
        System.out.println("Произведение всех чисел: " + product);

        scanner.close();
    }
}