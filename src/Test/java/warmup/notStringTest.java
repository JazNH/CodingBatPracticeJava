package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class notStringTest {

    @Test
    void notString_candy() {
        notString n = new notString();
        String val = n.notString("candy");
        assertEquals("not candy" , val);
    }

    @Test
    void notString_x() {
        notString n = new notString();
        String val = n.notString("x");
        assertEquals("not x" , val);
    }

    @Test
    void notString_not_bad() {
        notString n = new notString();
        String val = n.notString("not bad");
        assertEquals("not bad" , val);
    }
}