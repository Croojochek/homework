package HomeWork1;

import java.util.Scanner;

public class Job4_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num1 = scan.nextInt();
        System.out.print("Введите ещё одно число: ");
        int num2 = scan.nextInt();
        System.out.print("Введите последнее число, пожалуйста: ");
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 < num3) {
            System.out.println("Число " + num1 + " среднее!");
        } else if (num1 < num2 && num1 > num3) {
            System.out.println("Число " + num1 + " среднее!");
        } else if (num2 > num1 && num2 < num3) {
            System.out.println("Число " + num2 + " среднее!");
        } else if (num2 < num1 && num2 > num3) {
            System.out.println("Число " + num2 + " среднее!");
        } else
            System.out.println("Число " + num3 + " среднее!");
    }
}
