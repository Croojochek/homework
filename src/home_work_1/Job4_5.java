package HomeWork1;

import java.util.Scanner;

public class Job4_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число, обозначающее код символа по таблице ASCII: ");
        int code = scan.nextInt();

        if (code >= 65 && code <= 90) {
            System.out.println("Вы ввели код буквы!");
        } else if (code >= 97 && code <= 122) {
            System.out.println("Вы ввели код буквы!");
        } else
            System.out.println("Вы ввели код небуквенного символа!");
    }
}
