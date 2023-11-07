package home_work_1;

import java.util.Scanner;

public class Task4_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scan.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scan.nextInt();
    }
    public static String divisibility(int num1, int num2) {
        if (num1 % num2 == 0) {
            return "Первое число делится на второе!";
        } else {
            return "Первое число не делится на второе!";
        }
    }
}
