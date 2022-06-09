package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class startOzTest {

    @Test
    void startOz_ozymandias() {
        startOz s = new startOz();
        String val = s.startOz("ozymandias");
        assertEquals("oz", val);
    }

    @Test
    void startOz_bzoo() {
        startOz s = new startOz();
        String val = s.startOz("bzoo");
        assertEquals("z", val);
    }

    @Test
    void startOz_oxx() {
        startOz s = new startOz();
        String val = s.startOz("oxx");
        assertEquals("o", val);
    }

    @Test
    void startOz_o() {
        startOz s = new startOz();
        String val = s.startOz("o");
        assertEquals("o", val);
    }
}