package HomeWork1;

import java.io.IOException;
import java.util.Scanner;

public class Job4_4 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scan.nextInt();
        System.out.print("Введите символ [b], если хотите перевести Ваше число в байты,\n" +
                "или символ [k], если в килобайты: ");
        char symbol = (char) System.in.read();
        double kilo = (double) number / 1024;


        if (symbol == 'b') {
            System.out.println("Ваше число в байтах равно: " + number * 1024);
        } else if (symbol == 'k') {
            System.out.println("Ваше число в килобайтах равно: " + kilo);
        }
    }
}
