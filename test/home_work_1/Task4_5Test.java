package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4_5Test {
    @Test
    public void test1() {
        assertEquals(Task4_5.letterChek(0), "Вы ввели код небуквенного символа!");
    }
    @Test
    public void test2() {
        assertEquals(Task4_5.letterChek(68), "Вы ввели код буквы!");
    }
    @Test
    public void test3() {
        assertEquals(Task4_5.letterChek(112), "Вы ввели код буквы!");
    }
}
