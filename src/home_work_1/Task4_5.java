package home_work_1;

import java.util.Scanner;

public class Task4_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число, обозначающее код символа по таблице ASCII: ");
        int code = scan.nextInt();
    }
public static String letterChek(int code){
        if (code >= 65 && code <= 90) {
            return "Вы ввели код буквы!";
        } else if (code >= 97 && code <= 122) {
            return "Вы ввели код буквы!";
        } else
            return "Вы ввели код небуквенного символа!";
    }
}
