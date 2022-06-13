package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class makes10Test {

    @Test
    void makes10_1() {
        makes10 m = new makes10();
        boolean val = m.makes10(9,10);
        assertEquals(true, val);
    }

    @Test
    void makes10_2() {
        makes10 m = new makes10();
        boolean val = m.makes10(9,9);
        assertEquals(false, val);
    }

    @Test
    void makes10_3() {
        makes10 m = new makes10();
        boolean val = m.makes10(1,9);
        assertEquals(true, val);
    }
}