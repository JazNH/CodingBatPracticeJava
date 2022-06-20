package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class max1020Test {

    @Test
    void max1020_19_one() {
        max1020 m = new max1020();
        Integer val = m.max1020(11, 19);
        assertEquals(19,val);
    }

    @Test
    void max1020_19_two() {
        max1020 m = new max1020();
        Integer val = m.max1020(19, 11);
        assertEquals(19,val);
    }

    @Test
    void max1020_11() {
        max1020 m = new max1020();
        Integer val = m.max1020(11, 9);
        assertEquals(11,val);
    }
}