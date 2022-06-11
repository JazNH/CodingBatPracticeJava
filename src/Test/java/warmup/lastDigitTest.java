package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class lastDigitTest {

    @Test
    void lastDigit_7() {
        lastDigit l = new lastDigit();
        boolean val = l.lastDigit(7,17);
        assertEquals(true, val);
    }

    @Test
    void lastDigit_6() {
        lastDigit l = new lastDigit();
        boolean val = l.lastDigit(6,17);
        assertEquals(false, val);
    }

    @Test
    void lastDigit_3() {
        lastDigit l = new lastDigit();
        boolean val = l.lastDigit(3,113);
        assertEquals(true, val);
    }

    @Test
    void lastDigit_114() {
        lastDigit l = new lastDigit();
        boolean val = l.lastDigit(114,4);
        assertEquals(true, val);
    }
}