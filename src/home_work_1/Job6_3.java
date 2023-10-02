package home_work_1;

import java.util.Scanner;

public class Job6_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Как Вас зовут?");
        String name = scan.nextLine();
        String vasya = "Вася";
        String nastya = "Анастасия";

        switch (name) {
            case "Вася":
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
                break;
        }
    }
}
