package home_work_1;

import java.util.Scanner;

public class Task4_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите год, чтобы узнать является ли он високосным: ");
        int year = scan.nextInt();
    }
    public static String leapYearChek(int year) {
        if (year % 4 > 0) {
            return "Год невисокосный!";
        } else if (year % 4 == 0) {
            if (year % 100 > 0) {
                return "Год високосный!";
            } else if (year % 400 == 0) {
                return "Год високосный!";
            } else
                return "Год невисокосный!";
        } else
            return "Год невисокосный!";
    }
}
