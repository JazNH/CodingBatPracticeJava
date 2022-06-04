package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class posNegTest {

    @Test
    void posNeg_one() {
        posNeg p = new posNeg();
        boolean val = p.posNeg(1, -1, false);
        assertEquals(true,val);
    }

    @Test
    void posNeg_two() {
        posNeg p = new posNeg();
        boolean val = p.posNeg(-1, 1, false);
        assertEquals(true,val);
    }

    @Test
    void posNeg_three() {
        posNeg p = new posNeg();
        boolean val = p.posNeg(-4, -5, true);
        assertEquals(true,val);
    }

    @Test
    void posNeg_four() {
        posNeg p = new posNeg();
        boolean val = p.posNeg(-4, -5, false);
        assertEquals(false,val);
    }
}