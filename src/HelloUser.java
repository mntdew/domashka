public class HelloUser {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Привет, " + args[0] + "!");
        } else {
            System.out.println("Вы не передали имя. Пожалуйста, запустите программу с аргументом.");
            System.out.println("Пример: Иван");
        }
    }
}