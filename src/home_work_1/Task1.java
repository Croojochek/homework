package home_work_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.print("Введите первое число: ");
        int number_1 = scan.nextInt();                          // 8 = 1000
        System.out.print("Введите второе число: ");
        int number_2 = scan.nextInt();                          // 17 = 10001

        System.out.println("Используем побитовый оператор [&] для первого и второго чисел");
        int and = number_1 & number_2;
        System.out.println("Результат: "+ and);                 // 0

        System.out.println("Используем побитовый оператор [|] для первого и второго чисел");
        int or = number_1 | number_2;
        System.out.println("Результат: "+ or);                  // 11001

    }
    // побитовая операция невозможна с дробным литералом, лишь с целочисленным.
}