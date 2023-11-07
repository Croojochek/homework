package home_work_2.loops;

public class Task1_6 {
    /** Вывести таблицу умножения в консоль.
     * В консоли должно получиться также как и на картинке (динозаврика рисовать не надо) */
    public static void main(String[] args) {

        int mult = 1;
        int sum;

        for (int j = 0; j < 10; j++) {

            for (int i = 0; i < 1; i++) {
                sum = 2 * mult;
                System.out.print(2 + " * " + mult + " = " + sum + "\t    ");
                sum = 3 * mult;
                System.out.print(3 + " * " + mult + " = " + sum + "\t    ");
                sum = 4 * mult;
                System.out.print(4 + " * " + mult + " = " + sum + "\t    ");
                sum = 5 * mult;
                System.out.print(5 + " * " + mult + " = " + sum + "\t    ");
            }
            System.out.println("");
            mult = mult + 1;
        }
        System.out.println("");
        int mult2 = 1;

        for (int k = 0; k < 10; k++) {

            for (int l = 0; l < 1; l++) {
                sum = 6 * mult2;
                System.out.print(6 + " * " + mult2 + " = " + sum + "\t    ");
                sum = 7 * mult2;
                System.out.print(7 + " * " + mult2 + " = " + sum + "\t    ");
                sum = 8 * mult2;
                System.out.print(8 + " * " + mult2 + " = " + sum + "\t    ");
                sum = 9 * mult2;
                System.out.print(9 + " * " + mult2 + " = " + sum + "\t    ");
            }
            System.out.println("");
            mult2 = mult2 + 1;
        }
    }
}
