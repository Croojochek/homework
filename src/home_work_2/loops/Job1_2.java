package home_work_2.loops;


public class Job1_2 {

    /** Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль.
     Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.
     1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
     1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
     1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число */

    public static void main(String[] args) {

    // 1.2.1. multiplication(181232375);
    // 1.2.2. multiplication(99.2);
    // 1.2.3. multiplication("Привет");

    }
    public static String multiplication (String string) {
        char c = string.charAt(1);
        if (string.matches("^[a-zA-Z]*$")) {
            System.out.println("Введено не число");
        } else if (string.matches("\\d+")) {
            StringBuilder sb = new StringBuilder(string);
            sb.reverse();
            String reversedString = sb.toString();


            int num = Integer.parseInt (reversedString);
            int digit;
            int multi = 1;
            while (num > 10) {
                digit = num % 10;
                System.out.print(digit + " * ");
                multi = multi * digit;
                num = num / 10;
            }
            digit = num % 10;
            System.out.print(digit);
            multi = multi * digit;
            System.out.println(" = " + multi);


        } else {
            System.out.println("Введено не целое число");
        }
        return string;
    }
}
