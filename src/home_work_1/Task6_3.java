package home_work_1;

import java.util.Scanner;

public class Task6_3 implements ICommunicationPrinter{

    public String welcom(String name) {

        switch (name) {
            case "Вася":
                return "Привет! \n Я тебя так долго ждал";
            case "Анастасия":
                return "Я тебя так долго ждал";
            default:
                return "Добрый день, а вы кто?";
        }
    }
}
