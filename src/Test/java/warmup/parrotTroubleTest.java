package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class parrotTroubleTest {

    @Test
    void parrotTrouble_one() {
        parrotTrouble p = new parrotTrouble();
        boolean val = p.parrotTrouble(true, 6);
        assertEquals(true, val);
    }

    @Test
    void parrotTrouble_two() {
        parrotTrouble p = new parrotTrouble();
        boolean val = p.parrotTrouble(true, 7);
        assertEquals(false, val);
    }

    @Test
    void parrotTrouble_three() {
        parrotTrouble p = new parrotTrouble();
        boolean val = p.parrotTrouble(false, 6);
        assertEquals(false, val);
    }
}