package home_work_2.loops;


public class Task1_1 {

    /** Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
     * Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
     Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ */

        public static long getFactorial (int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
            for (int f = 1; f < num; f++) {
                System.out.print(f + " * ");
            }
                System.out.print(num + " = ");
                return result;
        }
}

