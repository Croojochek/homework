package home_work_2.loops;

import java.util.Random;
import java.util.Scanner;

public class Task1_5 {
    /** Задачи в презентации. На сайте есть пояснения по каждой из этих задач.
     * Все задачи в одном классе, в отдельных методах.
     1.5.1. Найти наибольшую цифру натурального числа
     1.5.2. Вероятность четных случайных чисел
     1.5.3. Посчитать четные и нечетные цифры числа
     1.5.4. Ряд Фибоначчи
     1.5.5. Вывести ряд чисел в диапазоне с шагом
     1.5.6. Переворот числа */
    public static void main(String[] args) {
        // 1.5.1. maxDigit();
        // 1.5.2. chanceEvenNumber();
        // 1.5.3. digitsEvenAndOdd();
        // 1.5.4. fibonacci();
        // 1.5.5. step(); Ввод с клавиатуры
        // 1.5.6. turnOver();

    }
    public static int maxDigit(int num) {
        int max;
        int next;
        max = num % 10;
        num = num / 10;

        while (num > 0) {
            next = num % 10;

            if (next > max) {
                max = next;
            }
            num = num / 10;
        }
        System.out.println(max);
        return max;
    }

    public static int chanceEvenNumber(int num) {
        Random rnd = new Random();
        int k = 0;
        for (int i = 0; i < num; i++) {
            int randomNumber = rnd.nextInt(99);
                if(randomNumber % 2 == 0) {
                    k = k + 1;
                }

        }
        int chance = k * 100 / num;
        System.out.println(chance + "%");
        return  chance;
    }

    public static void digitsEvenAndOdd (int num) {
        int even = 0;
        int odd = 0;
        int digit;

        while (num > 0) {
            digit = num % 10;

            if (digit % 2 == 0) {
                even = even + 1;
            } else {
                odd = odd + 1;
            }
            num = num / 10;
        }

        System.out.println("В Вашем числе " + even + " чётных и " + odd + " нечетных чисел.");
    }

    public static void fibonacci(int num) {
        int first = 1;
        int next = 1;
        int sum;
        System.out.print(first + " ");

        for (int i = 0; i < num - 1; i++) {
            sum = first + next;
            System.out.print(sum + " ");
            first = next;
            next = sum;
        }
    }

    public static void step() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите минимум: ");
        int minNumber = scan.nextInt();
        System.out.print("Введите максимум: ");
        int maxNumber = scan.nextInt();
        System.out.print("Введите шаг: ");
        int step = scan.nextInt();


        while (minNumber <= maxNumber) {
            System.out.print(minNumber + " ");
            minNumber = minNumber + step;
        }
    }

    public static String turnOver(int num) {
        String str = String.valueOf(num);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String reversedString = sb.toString();

        System.out.println(reversedString);
        return reversedString;
    }
}
