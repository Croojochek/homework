package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4_4Test {
    @Test
    public void testByte(){
        assertEquals(Task4_4.kiloToByte(1), 1024);
    }
    @Test
    public void testKilobyte(){
        assertEquals(Task4_4.byteToKilo(1024), 1);
    }
}
