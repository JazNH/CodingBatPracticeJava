import org.junit.jupiter.api.Test;
import com.codingbat.sleepIn;

import static org.junit.jupiter.api.Assertions.assertEquals;

class sleepInTest {

    @Test
    public void sleepIn_false_false() {
        sleepIn s = new sleepIn();
        boolean val = s.sleepIn(false, false);
        assertEquals(true, val);
    }

    @Test
    public void sleepIn_true_false() {
        sleepIn s = new sleepIn();
        boolean val = s.sleepIn(true, false);
        assertEquals(false, val);
    }

    @Test
    public void sleepIn_false_true() {
        sleepIn s = new sleepIn();
        boolean val = s.sleepIn(false, true);
        assertEquals(true, val);
    }
}