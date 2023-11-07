package home_work_1;

import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num1 = scan.nextInt();
        System.out.print("Введите ещё одно число: ");
        int num2 = scan.nextInt();
        System.out.print("Введите последнее число, пожалуйста: ");
        int num3 = scan.nextInt();
    }
    public static String average(int num1, int num2, int num3) {
        if (num1 > num2 && num1 < num3) {
            return "Первое число среднее!";
        } else if (num1 < num2 && num1 > num3) {
            return "Первое число среднее!";
        } else if (num2 > num1 && num2 < num3) {
            return "Второе число среднее!";
        } else if (num2 < num1 && num2 > num3) {
            return "Второе число среднее!";
        } else
            return "Третье число среднее!";
    }
}
