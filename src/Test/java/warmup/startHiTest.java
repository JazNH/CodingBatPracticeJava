package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class startHiTest {

    @Test
    public void startHi_hi_there() {
        startHi s = new startHi();
        boolean val = s.startHi("hi there");
        assertEquals(true, val);
    }

    @Test
    public void startHi_hi() {
        startHi s = new startHi();
        boolean val = s.startHi("hi");
        assertEquals(true, val);
    }

    @Test
    public void startHi_hello_hi() {
        startHi s = new startHi();
        boolean val = s.startHi("hello hi");
        assertEquals(false, val);
    }

    @Test
    public void startHi_hello_ho_hi() {
        startHi s = new startHi();
        boolean val = s.startHi("ho hi");
        assertEquals(false, val);
    }

    @Test
    public void startHi_hello_hi_ho() {
        startHi s = new startHi();
        boolean val = s.startHi("hi ho");
        assertEquals(true, val);
    }

}