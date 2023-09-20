package HomeWork1;

import java.util.Scanner;

public class Job4_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите год, чтобы узнать является ли он високосным: ");
        int year = scan.nextInt();

        if (year % 4 > 0) {
            System.out.println("Год невисокосный!");
        } else if (year % 4 == 0) {
            if (year % 100 > 0) {
                System.out.println("Год високосный!");
            } else if (year % 400 == 0) {
                System.out.println("Год високосный!");
            } else
                System.out.println("Год невисокосный!");
        } else
            System.out.println("Год невисокосный!");
    }
}
