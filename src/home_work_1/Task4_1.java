package home_work_1;

import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num1 = scan.nextInt();
        System.out.print("Введите ещё одно число: ");
        int num2 = scan.nextInt();
    }
    public static String parityOfNumber(int num1, int num2) {
        if (num1 % 2 == 0) {
            if (num2 % 2 == 0) {
                return "Вы ввели чётные числа!";
            } else {
                return "Второе число является нечётным!";
            }
        } else if (num2 % 2 != 0) {
            return "Вы ввели нечётные числа!";
        } else
            return "Первое число является нечётным!";
    }

}
