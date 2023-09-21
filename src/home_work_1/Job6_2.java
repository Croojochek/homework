package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class Job6_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Как Вас зовут?");
        String name = scan.nextLine();
        String vasya = "Вася";
        String nastya = "Анастасия";

        if (Objects.equals(name, vasya)) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        } else if (Objects.equals(name, nastya)) {
            System.out.println("Я тебя так долго ждал");
        } else
            System.out.println("Добрый день, а вы кто?");
    }
}
