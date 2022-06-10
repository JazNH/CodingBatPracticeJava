package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class in3050Test {

    @Test
    void in3050_one() {
        in3050 i = new in3050();
        boolean val = i.in3050(30,31);
        assertEquals(true, val);
    }

    @Test
    void in3050_two() {
        in3050 i = new in3050();
        boolean val = i.in3050(30,41);
        assertEquals(false, val);
    }

    @Test
    void in3050_three() {
        in3050 i = new in3050();
        boolean val = i.in3050(40,50);
        assertEquals(true, val);
    }
}