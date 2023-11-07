package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task7Test {
    @Test
    public void test1() {
        assertEquals(Task7.createPhoneNumber(new Integer[]{1,2,3,4,5,6,7,8,9,0}), "(123) 456-7890");
    }
}
