package home_work_2.arrays;

import static home_work_2.utils.ArraysUtils.arrayFromConsole;

public class ArraysIteration {
    /** Создать класс ArraysIteration. В этом классе написать перебор (итерирование) массива при помощи do....while, while, for, foreach.
     * Вызывая ранее созданный метод arrayFromConsole (ArraysUtils.arrayFromConsole()) получить массив.
     * Все задачи в одном классе, в отдельных методах, в каждом методе используется 4 разных цикла.
     * Должно получиться 3 метода:
     2.2.1. Вывести все элементы в консоль.
     2.2.2. Вывести каждый второй элемент массива в консоль.
     2.2.3. Вывести все элементы массива в консоль в обратном порядке. */

    public static void main(String[] args) {
        int[] container = arrayFromConsole();

        printAllElements(container); // 2.2.1.
        printEverySecondElements(container); // 2.2.2.
        printReversElements(container); // 2.2.3.

    }

    public static void printAllElements(int[] arr) {
        int i = 0;
        int j = 0;

        do {
            System.out.print(arr[i] + " ");
            i++;
        } while (i < arr.length);
        System.out.print("| ");

        while (j < arr.length) {
            System.out.print(arr[j] + " ");
            j++;
        }
        System.out.print("| ");

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.print("| ");

        for (int l : arr) {
            System.out.print(l + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
    }

    public static void printEverySecondElements(int[] arr) {
        int i = 1;
        int j = 1;
        int f = 1;

        do {
            if((i + 1) % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
            i++;
        } while (i < arr.length);
        System.out.print("| ");

        while (j < arr.length) {
            if((j + 1) % 2 == 0) {
                System.out.print(arr[j] + " ");
            }
            j++;
        }
        System.out.print("| ");

        for (int k = 1; k < arr.length; k++) {
            if((k + 1) % 2 == 0) {
                System.out.print(arr[k] + " ");
            }
        }
        System.out.print("| ");

        for (int l : arr) {
            if(f % 2 == 0) {
                System.out.print(l + " ");
            }
            f = f + 1;
        }
        System.out.println(" ");
        System.out.println(" ");
    }

    public static void printReversElements(int[] arr) {
        int j = arr.length - 1;
        int k = arr.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("| ");

        do {
            System.out.print(arr[j] + " ");
            j = j - 1;
        } while (j >= 0);
        System.out.print("| ");

        while (k >= 0) {
            System.out.print(arr[k] + " ");
            k = k - 1;
        }
        System.out.print("| ");

        StringBuilder stringArr = new StringBuilder();
        for (int l : arr) {
            stringArr.append(l).append(" ");
        }
        System.out.print(stringArr.reverse());

    }
}
