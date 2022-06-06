package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class or35Test {

    @Test
    void or35_3() {
        or35 o = new or35();
        boolean val = o.or35(3);
        assertEquals(true, val);
    }

    @Test
    void or35_10() {
        or35 o = new or35();
        boolean val = o.or35(10);
        assertEquals(true, val);
    }

    @Test
    void or35_8() {
        or35 o = new or35();
        boolean val = o.or35(8);
        assertEquals(false, val);
    }
}