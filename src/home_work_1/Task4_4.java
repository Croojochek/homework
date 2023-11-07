package home_work_1;

import java.io.IOException;
import java.util.Scanner;

public class Task4_4 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scan.nextInt();
        System.out.print("Введите символ [b], если хотите перевести Ваше число в байты,\n " +
                "или символ [k], если в килобайты: ");
        char symbol = (char) System.in.read();
        double kilo = (double) number / 1024;
    }
    public static int kiloToByte(int number) {
            return number * 1024;
        }
    public static int byteToKilo(int num) {
            return num / 1024;
    }

}
