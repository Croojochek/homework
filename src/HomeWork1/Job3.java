package HomeWork1;

import java.util.Scanner;

public class Job3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scan.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scan.nextDouble();

        System.out.println("Наибольшее из введённых чисел: " + Math.max(num1 , num2));

        System.out.println("Первое число во второй степени равно: " + Math.pow(num1 , 2));
        System.out.println("Второе число во второй степени равно: " + Math.pow(num2 , 2));

        double area1 = Math.round(Math.PI * Math.pow(num1 , 2));
        double area2 = Math.round(Math.PI * Math.pow(num2 , 2));
        System.out.println("Площадь круга, с радиусом равным первому числу, равен: " + area1);
        System.out.println("Площадь круга, с радиусом равным второму числу, равен: " + area2);

    }
}
