package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sumDoubleTest {

    @Test
    void sumDouble_1() {
        sumDouble s = new sumDouble();
        int val = s.sumDouble(1,2);
        assertEquals(3, val);
    }

    @Test
    void sumDouble_3() {
        sumDouble s = new sumDouble();
        int val = s.sumDouble(3,2);
        assertEquals(5, val);
    }

    @Test
    void sumDouble_2() {
        sumDouble s = new sumDouble();
        int val = s.sumDouble(2,2);
        assertEquals(8, val);
    }
}