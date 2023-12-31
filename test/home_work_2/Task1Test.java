package home_work_2;

import home_work_2.loops.Task1_1;
import home_work_2.loops.Task1_3;
import home_work_2.loops.Task1_5;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test {
    @Test
    @DisplayName("Тест для Task1_1")
    public void test1() {
        assertEquals(Task1_1.getFactorial(5), 120);
    }
    @Test
    @DisplayName("Тест для Task1_3")
    public void test2() {
        assertEquals(Task1_3.pow(4, 2), "16.0");
    }
    @Test
    @DisplayName("Тест для Task1_3")
    public void test3() {
        assertEquals(Task1_3.pow(4, -2), "Степень должна быть положительной!");
    }
    @Test
    @DisplayName("Тест для Task1_5.1")
    public void test4() {
        assertEquals(Task1_5.maxDigit(158), 8);
    }
    @Test
    @DisplayName("Тест для Task1_5.1")
    public void test5() {
        assertEquals(Task1_5.maxDigit(-100), 0);
    }
    @Test
    @DisplayName("Тест для Task1_5.6")
    public void test6() {
        assertEquals(Task1_5.turnOver(158), "851");
    }
}
