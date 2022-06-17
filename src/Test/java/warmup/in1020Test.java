package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class in1020Test {

    @Test
    void in1020_12() {
        in1020 i = new in1020();
        boolean val = i.in1020(12,99);
        assertEquals(true, val);
    }

    @Test
    void in1020_21() {
        in1020 i = new in1020();
        boolean val = i.in1020(21,12);
        assertEquals(true, val);
    }

    @Test
    void in1020_8() {
        in1020 i = new in1020();
        boolean val = i.in1020(8,99);
        assertEquals(false, val);
    }
}