package home_work_1;

import java.util.Objects;

public class Task6_1 implements ICommunicationPrinter{
    public static String welcom(String name){
        if (Objects.equals(name, "Вася")) {
            return "Привет! \n Я тебя так долго ждал";
        } else {
            if (Objects.equals(name, "Анастасия")) {
                return "Я тебя так долго ждал";
            } else
                return "Добрый день, а вы кто?";
        }
    }
}
