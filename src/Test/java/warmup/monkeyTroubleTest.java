package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class monkeyTroubleTest {

    @Test
    void monkeyTrouble_all_good() {
        monkeyTrouble m = new monkeyTrouble();
        boolean val = m.monkeyTrouble(true, false);
        assertEquals( false, val);
    }

    @Test
    void monkeyTrouble_both_true() {
        monkeyTrouble m = new monkeyTrouble();
        boolean val = m.monkeyTrouble(true, true);
        assertEquals( true, val);
    }

    @Test
    void monkeyTrouble_both_false() {
        monkeyTrouble m = new monkeyTrouble();
        boolean val = m.monkeyTrouble(false, false);
        assertEquals( true, val);
    }
}