package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class everyNthTest {

    @Test
    void everyNth_Mrce() {
        everyNth e = new everyNth();
        String val = e.everyNth("Miracle", 2);
        assertEquals("Mrce", val);
    }

    @Test
    void everyNth_aceg() {
        everyNth e = new everyNth();
        String val = e.everyNth("abcdefg", 2);
        assertEquals("aceg", val);
    }

    @Test
    void everyNth_adg() {
        everyNth e = new everyNth();
        String val = e.everyNth("abcdefg", 3);
        assertEquals("adg", val);
    }
}