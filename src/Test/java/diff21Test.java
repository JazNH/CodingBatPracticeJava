import com.codingbat.diff21;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class diff21Test {

    @Test
    public void diff21_19() {
        diff21 d = new diff21();
        int val = d.diff21(19);
        assertEquals(2, val);
    }

    @Test
    public void diff21_10() {
        diff21 d = new diff21();
        int val = d.diff21(10);
        assertEquals(11, val);
    }

    @Test
    public void diff21_21() {
        diff21 d = new diff21();
        int val = d.diff21(21);
        assertEquals(0, val);
    }

    @Test
    public void diff21_not_equal_to_1() {
        diff21 d = new diff21();
        int val = d.diff21(21);
        assertNotEquals(1, val);
    }
}