public class Task4 {
    public static void main(String[] args) {
        String secretPassword = "qwe123123";

        if (args.length > 0) {
            String userPassword = args[0];
            if (userPassword.equals(secretPassword)) {
                System.out.println("Пароль верный! Добро пожаловать.");
            } else {
                System.out.println("Пароль неверный. Доступ запрещен.");
            }

        } else {
            System.out.println("Вы забыли ввести пароль!");
        }
    }
}