import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        // Проверяем, передал ли пользователь количество чисел
        if (args.length > 0) {
            try {
                // Преобразуем введенный аргумент (строку) в целое число
                int count = Integer.parseInt(args[0]);

                // Создаем объект для генерации случайных чисел
                Random random = new Random();

                // --- 1. Вывод С ПЕРЕХОДОМ на новую строку ---
                System.out.println("Числа с переходом на новую строку:");
                for (int i = 0; i < count; i++) {
                    // Генерируем число от 0 до 99 (можно изменить диапазон)
                    int number = random.nextInt(100);
                    // println выводит и сразу переводит на новую строку
                    System.out.println(number);
                }

                System.out.println(); // Пустая строка для отступа

                // --- 2. Вывод БЕЗ ПЕРЕХОДА на новую строку ---
                System.out.println("Числа без перехода на новую строку (в строку):");
                for (int i = 0; i < count; i++) {
                    int number = random.nextInt(100);
                    // print выводит число и оставляет курсор на той же строке
                    System.out.print(number + " ");
                }
                System.out.println(); // Переводим строку в самом конце

            } catch (NumberFormatException e) {
                System.out.println("Ошибка: аргумент должен быть целым числом.");
            }
        } else {
            System.out.println("Вы не указали количество чисел. Укажите его в аргументах (например, 5).");
        }
    }
}