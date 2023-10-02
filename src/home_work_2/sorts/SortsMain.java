package home_work_2.sorts;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;

import static home_work_2.utils.SortsUtils.shake;
import static home_work_2.utils.SortsUtils.sort;


public class SortsMain {
    /** Создать класс SortsMain. Все проверки пишутся в main.
     4.2.1. После каждого теста в консоль вы должны распечатать сообщение формата
     "[Какой массив был до сортировки] -> [Каким стал массив после сортировки]".
     Для преобразования массива в текст можно использовать класс Arrays.
     4.2.2. Для тестов используем предварительно созданные массивы:
     4.2.2.1. new int[]{1,2,3,4,5,6}
     4.2.2.2. new int[]{1,1,1,1}
     4.2.2.3. new int[]{9,1,5,99,9,9}
     4.2.2.4. new int[]{}
     4.2.2.5. new int[]{6,5,4,3,2,1}
     4.2.2 После предварительных тестов пишем тест с рандомным заполнением массива.
     Вызывая ранее созданный метод arrayRandom (ArraysUtils.arrayRandom(50, 100)) получить массив. Отсортировать.
     4.2.3 После теста с рандомно заполненным массивом пишем тест с массивом полученным через консоль.
     Вызывая ранее созданный метод arrayFromConsole (ArraysUtils.arrayFromConsole()) получить массив. Отсортировать. */

    public static void main(String[] args) {
        int[] container1 = new int[]{1,2,3,4,5,6};
        System.out.println(Arrays.toString(container1));
        sort(container1);
        System.out.println(Arrays.toString(container1));
        shake(container1);
        System.out.println(Arrays.toString(container1));

        int[] container2 = new int[]{1,1,1,1};
        System.out.println(Arrays.toString(container2));
        sort(container2);
        System.out.println(Arrays.toString(container2));
        shake(container2);
        System.out.println(Arrays.toString(container2));

        int[] container3 = new int[]{9,1,5,99,9,9};
        System.out.println(Arrays.toString(container3));
        sort(container3);
        System.out.println(Arrays.toString(container3));
        shake(container3);
        System.out.println(Arrays.toString(container3));

        int[] container4 = new int[]{};
        System.out.println(Arrays.toString(container4));
        sort(container4);
        System.out.println(Arrays.toString(container4));
        shake(container4);
        System.out.println(Arrays.toString(container4));

        int[] container5 = new int[]{6,5,4,3,2,1};
        System.out.println(Arrays.toString(container5));
        sort(container5);
        System.out.println(Arrays.toString(container5));
        shake(container5);
        System.out.println(Arrays.toString(container5));


        int[] container6 = ArraysUtils.arrayRandom(50, 100);
        System.out.println(Arrays.toString(container6));
        sort(container6);
        System.out.println(Arrays.toString(container6));
        shake(container6);
        System.out.println(Arrays.toString(container6));

        int[] container7 = ArraysUtils.arrayFromConsole();
        System.out.println(Arrays.toString(container7));
        sort(container7);
        System.out.println(Arrays.toString(container7));
        shake(container7);
        System.out.println(Arrays.toString(container7));
    }
}
