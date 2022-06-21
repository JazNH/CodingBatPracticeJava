package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class endUpTest {

    @Test
    void endUp_Hello() {
        endUp e = new endUp();
        String val = e.endUp("Hello");
        assertEquals("HeLLO", val);
    }

    @Test
    void endUp_hithere() {
        endUp e = new endUp();
        String val = e.endUp("hi there");
        assertEquals("hi thERE", val);
    }

    @Test
    void endUp_hi() {
        endUp e = new endUp();
        String val = e.endUp("hi");
        assertEquals("HI", val);
    }
}