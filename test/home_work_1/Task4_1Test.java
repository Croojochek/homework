package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4_1Test {
    @Test
    public void test1(){
        String result = Task4_1.parityOfNumber(0, 0);
        assertEquals(result, "Вы ввели чётные числа!");
    }
    @Test
    public void test2(){
        String result = Task4_1.parityOfNumber(-1, -2);
        assertEquals(result, "Первое число является нечётным!");
    }
    @Test
    public void test3(){
        String result = Task4_1.parityOfNumber(2, 39);
        assertEquals(result, "Второе число является нечётным!");
    }
    @Test
    public void test4(){
        String result = Task4_1.parityOfNumber(-7, 3);
        assertEquals(result, "Вы ввели нечётные числа!");
    }

}
