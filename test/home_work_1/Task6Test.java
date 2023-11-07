package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task6Test {
    @Test
    public void welcom1() {
        String result = Task6_1.welcom("Вася");
        assertEquals(result, "Привет! \n Я тебя так долго ждал");
    }
    @Test
    public void welcom2() {
        String result = Task6_1.welcom("Анастасия");
        assertEquals(result, "Я тебя так долго ждал");
    }
    @Test
    public void welcom3() {
        String result = Task6_1.welcom("Алексей");
        assertEquals(result, "Добрый день, а вы кто?");
    }
}
