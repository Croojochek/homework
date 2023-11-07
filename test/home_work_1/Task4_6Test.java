package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4_6Test {
    @Test
    public void test1() {
        assertEquals(Task4_6.leapYearChek(1700), "Год невисокосный!");
    }
    @Test
    public void test2() {
        assertEquals(Task4_6.leapYearChek(1600), "Год високосный!");
    }
    @Test
    public void test3() {
        assertEquals(Task4_6.leapYearChek(1996), "Год високосный!");
    }

}
