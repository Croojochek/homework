package home_work_2.loops;

import java.util.Scanner;

public class Job1_3 {
    /**Возведение в степень. Через консоль пользователь вводит два числа.
     * Первое число это число которое мы будем возводить, Второе число это степень в которую возводят первое число.
     * Степень - только положительная и целая. Возводимое число - может быть отрицательным и оно будет дробным.
     * Math использовать нельзя.
     1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
     1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        double number = scan.nextDouble();
        System.out.print("Введите степень, в которую хотите возвести число: ");
        int power = scan.nextInt();

        if (power < 0) {
            System.out.println("Степень должна быть положительной!");
        }
        double r = 1;
        for (int i = 0;i < power; i++) {
            r = r*number;
        }
        System.out.println(number + " ^ " + power + " = " + r);
    }
}
