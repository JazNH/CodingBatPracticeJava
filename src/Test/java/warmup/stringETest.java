package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class stringETest {

    @Test
    void stringE_Hello() {
        stringE s = new stringE();
        boolean val = s.stringE("Hello");
        assertEquals(true, val);
    }

    @Test
    void stringE_Heelle() {
        stringE s = new stringE();
        boolean val = s.stringE("Heelle");
        assertEquals(true, val);
    }

    @Test
    void stringE_Heelele() {
        stringE s = new stringE();
        boolean val = s.stringE("Heelele");
        assertEquals(false, val);
    }
}