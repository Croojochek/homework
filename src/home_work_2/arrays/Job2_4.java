package home_work_2.arrays;

import java.util.Arrays;
import java.util.Scanner;

import static home_work_2.utils.ArraysUtils.arrayRandom;

public class Job2_4 {
    /** Задачи в презентации. На сайте есть пояснения по каждой из этих задач.
     * Все задачи в одном классе, в отдельных методах.
     * Для получения массивов вызывать ранее созданный метод arrayRandom (ArraysUtils.arrayRandom(50, 100))
     2.4.1. Сумма четных положительных элементов массива
     2.4.2. Максимальный из элементов массива с четными индексами
     2.4.3. Элементы массива, которые меньше среднего арифметического
     2.4.4. Найти два наименьших (минимальных) элемента массива
     2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
     2.4.6. Сумма цифр массива */
    public static void main(String[] args) {
        //2.4.1. sumEvenPositiveNumbers();
        //2.4.2. maxEvenElement();
        //2.4.3. minAverageElements();
        //2.4.4. twoMinElements();
        //2.4.5. compressedArray();
        //2.4.6. sumAllNumbers();

    }

    public static void sumEvenPositiveNumbers() {
        int[] container = arrayRandom(50 , 100);
        int sum = 0;
        for (int i = 0; i < container.length; i++) {
            if(container[i] > 0 && container[i] % 2 == 0) {
                sum = sum + container[i];
            }
        }
        System.out.println(sum);
    }

    public static void maxEvenElement() {
        int[] container = arrayRandom(50 , 100);
        int max = 0;
        int element = 0;
        for (int i = 0; i < container.length; i = i + 2) {
            if(container[i] > max) {
                max = container[i];
                element = i;
            }
        }
        System.out.println("Максимальный элемент массива: " + element);
        System.out.println("Он равен: " + max);
    }

    public static void minAverageElements() {
        int[] container = arrayRandom(50 , 100);
        int sum = 0;
        for (int i = 0; i < container.length; i++) {
            sum = sum + container[i];
        }
        int average = sum / container.length;

        for (int i = 0; i < container.length; i++) {
               if(container[i] < average) {
                   System.out.println("container[" + i + "] " + container[i]);
               }
        }
    }

    public static void twoMinElements() {
        int[] container = arrayRandom(50 , 100);

        int k = 0;
        int element = container[k];
        int min1 = 0;
        int min2 = 0;
        int i;

        for (i = 1; i < container.length; i++) {
            if(container[i] < element) {
                min1 = container[i];
            }
            for (int j = 1; j < container.length; j++) {
                if(container[j] < element && i != j) {
                    min2 = container[j];
                }
                k++;
            }
            k++;
        }
        System.out.println("Минимальные элементы: " + min1 + " " + min2);
    }

    public static void compressedArray() {
        int[] container = arrayRandom(50 , 100);
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите начало интервала: ");
        int a = scan.nextInt();
        System.out.print("Введите конец интервала: ");
        int b = scan.nextInt();


        int abcount = 0;
        for (int i = 0; i < container.length; i++) {
            if (container[i]>=a && container[i]<=b) {
                abcount++;
            } else {
                container[i - abcount] = container[i];
            }
        }

        for (int i = container.length - abcount; i < container.length; i++) {
            container[i] = 0;
        }

        System.out.println("" + Arrays.toString(container));
    }

    public static int sumAllNumbers() {
        int[] container = arrayRandom(50 , 100);
        int sum = 0;
        int num;
        int i = 0;

        for (int j = 0; j < container.length; j++) {
            num = container[j];
            while(num != 0) {
                i = num % 10;
                sum = sum + i;
                num = num / 10;
            }
        }
        return sum;
    }
}
