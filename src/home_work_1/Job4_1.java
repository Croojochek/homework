package HomeWork1;

import java.util.Scanner;

public class Job4_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num1 = scan.nextInt();
        System.out.print("Введите ещё одно число: ");
        int num2 = scan.nextInt();

        if (num1 % 2 == 0) {
            if (num2 % 2 == 0) {
                System.out.println("Вы ввели чётные числа!");
            } else {
                System.out.println("Число " + num2 + " является нечётным!");
            }
        } else if (num2 % 2 != 0) {
            System.out.println("Вы ввели нечётные числа!");
        } else
            System.out.println("Число " + num1 + " является нечётным!");
    }
}
