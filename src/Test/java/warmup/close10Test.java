package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class close10Test {

    @Test
    void close10_1st() {
        close10 c = new close10();
        int val = c.close10(8,13);
        assertEquals(8, val);
    }

    @Test
    void close10_2nd() {
        close10 c = new close10();
        int val = c.close10(13,8);
        assertEquals(8, val);
    }

    @Test
    void close10_negative_1st() {
        close10 c = new close10();
        int val = c.close10(-8,-13);
        assertEquals(8, val);
    }

    @Test
    void close10_negative_2nd() {
        close10 c = new close10();
        int val = c.close10(-13,-8);
        assertEquals(8, val);
    }

    @Test
    void close10_tie() {
        close10 c = new close10();
        int val = c.close10(13,7);
        assertEquals(0, val);
    }
}