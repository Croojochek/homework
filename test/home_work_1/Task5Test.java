package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task5Test {
    @Test
    public void test1() {
        assertEquals(Task5.sleepIn(true, true), "Можем спать дальше");
    }
    @Test
    public void test2() {
        assertEquals(Task5.sleepIn(false, true), "Можем спать дальше");
    }
    @Test
    public void test3() {
        assertEquals(Task5.sleepIn(true, false), "Можем спать дальше");
    }
    @Test
    public void test4() {
        assertEquals(Task5.sleepIn(false, false), "Пора идти на работу");
    }
}
