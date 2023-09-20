package HomeWork1;

import java.util.Scanner;

public class Job4_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scan.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scan.nextInt();

        double num3 = (double) num1 % num2;
        double num4 = (double) num1 / num2;
        int num5 = num1 / num2;


        if (num3 == 0) {
            System.out.println("Первое число делится на второе!");
            System.out.println(num1 + " : " + num2 + " = " + num5);
        } else {
            System.out.println("Первое число делится на второе!");
            System.out.println(num1 + " : " + num2 + " = " + num4);
        }
    }
}
