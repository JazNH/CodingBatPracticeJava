package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class icyHotTest {

    @Test
    void icyHot_120() {
        icyHot i = new icyHot();
        boolean val = i.icyHot(120, -1);
        assertEquals(true, val);
    }

    @Test
    void icyHot_neg1() {
        icyHot i = new icyHot();
        boolean val = i.icyHot(-1, 120);
        assertEquals(true, val);
    }

    @Test
    void icyHot_2() {
        icyHot i = new icyHot();
        boolean val = i.icyHot(2, 120);
        assertEquals(false, val);
    }
}