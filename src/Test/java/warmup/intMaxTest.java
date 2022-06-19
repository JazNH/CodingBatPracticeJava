package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class intMaxTest {

    @Test
    void intMax_one() {
        intMax m = new intMax();
        Integer val = m.intMax(1,2,3);
        assertEquals(3, val);
    }

    @Test
    void intMax_two() {
        intMax m = new intMax();
        Integer val = m.intMax(1,3, 2);
        assertEquals(3, val);
    }

    @Test
    void intMax_three() {
        intMax m = new intMax();
        Integer val = m.intMax(3,2,1);
        assertEquals(3, val);
    }
}