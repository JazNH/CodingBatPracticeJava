package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class hasTeenTest {

    @Test
    void hasTeen_one_test() {
        hasTeen h = new hasTeen();
        boolean val = h.hasTeen(13,20,10);
        assertEquals(true, val);
    }

    @Test
    void hasTeen_two_test() {
        hasTeen h = new hasTeen();
        boolean val = h.hasTeen(20,19,10);
        assertEquals(true, val);
    }

    @Test
    void hasTeen_three_test() {
        hasTeen h = new hasTeen();
        boolean val = h.hasTeen(20,30,10);
        assertEquals(false, val);
    }
}