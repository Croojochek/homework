package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4_2Test {
    @Test
    public void test1() {
        String result = Task4_2.average(-1, 0, 1);
        assertEquals(result, "Второе число среднее!");
    }
    @Test
    public void test2() {
        String result = Task4_2.average(-2, 0, -1);
        assertEquals(result, "Третье число среднее!");
    }
    @Test
    public void test3() {
        String result = Task4_2.average(5, 0, 6);
        assertEquals(result, "Первое число среднее!");
    }

}
