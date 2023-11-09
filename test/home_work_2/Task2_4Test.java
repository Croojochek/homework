package home_work_2;

import home_work_2.arrays.Task2_4;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2_4Test {
    @Test
    @DisplayName("Тест для Task2_4.1")
    public void test1() {
        assertEquals(Task2_4.sumEvenPositiveNumbers(new int[]{1,2,2,2,0,4,1}), 10);
    }
    @Test
    @DisplayName("Тест для Task2_4.2")
    public void test2() {
        assertEquals(Task2_4.maxEvenElement(new int[]{1,2,2,2,0,4,1}), 2);
    }

}
