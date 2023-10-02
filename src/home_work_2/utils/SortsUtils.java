package home_work_2.utils;

public class SortsUtils {
    /** Создать класс SortsUtils. В этом классе не должно быть main метода. В этом классе написать следующие методы:
     4.1.1. Написать метод public static void sort(int[] arr).
     Данный метод будет сортировать переданный ему массив при помощи алгоритма пузырьковая сортировка.
     Описание алгоритма: https://prog-cpp.ru/sort-bubble/
     4.1.2. Написать метод public static void shake(int[] arr).
     Данный метод будет сортировать переданный ему массив при помощи алгоритма шейкерная сортировка.
     Описание алгоритма: https://prog-cpp.ru/sort-shaker/ */

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = (arr.length - 1); j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void shake(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int flag = 1;

        while ((left < right) && flag > 0) {
            flag = 0;

            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    int t = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = t;
                    flag = 1;
                }
            }
            right--;

            for (int j = right; j > left; j--) {
                if (arr[j - 1] > arr[j]) {
                    int t = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = t;
                    flag = 1;
                }
            }
            left++;
        }
    }
}
