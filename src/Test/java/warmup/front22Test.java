package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class front22Test {

    @Test
    void front22_kitten() {
        front22 f = new front22();
        String val = f.front22("kitten");
        assertEquals("kikittenki", val);
    }

    @Test
    void front22_Ha() {
        front22 f = new front22();
        String val = f.front22("Ha");
        assertEquals("HaHaHa", val);
    }

    @Test
    void front22_abc() {
        front22 f = new front22();
        String val = f.front22("abc");
        assertEquals("ababcab", val);
    }
}