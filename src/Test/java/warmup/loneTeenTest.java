package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class loneTeenTest {

    @Test
    void loneTeen_1() {
        loneTeen l = new loneTeen();
        boolean val = l.loneTeen(13,99);
        assertEquals(true, val);
    }

    @Test
    void loneTeen_2() {
        loneTeen l = new loneTeen();
        boolean val = l.loneTeen(21,19);
        assertEquals(true, val);
    }

    @Test
    void loneTeen_3() {
        loneTeen l = new loneTeen();
        boolean val = l.loneTeen(13,13);
        assertEquals(false, val);
    }

}