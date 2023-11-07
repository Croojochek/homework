package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4_3Test {
    @Test
    public void test1() {
        String result = Task4_3.divisibility(-2, 4);
        assertEquals(result, "Первое число не делится на второе!");
    }
    @Test
    public void test2() {
        String result = Task4_3.divisibility(-10, 5);
        assertEquals(result, "Первое число делится на второе!");
    }
    @Test
    public void test3() {
        String result = Task4_3.divisibility(10, 1);
        assertEquals(result, "Первое число делится на второе!");
    }
    @Test
    public void test4() {
        String result = Task4_3.divisibility(21, 5);
        assertEquals(result, "Первое число не делится на второе!");
    }
}
