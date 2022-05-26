package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class backAroundTest {

    @Test
    public void backAround_cat(){
        backAround b = new backAround();
        String val = b.backAround("cat");
        assertEquals("tcatt", val);
    }

    @Test
    public void backAround_hello(){
        backAround b = new backAround();
        String val = b.backAround("hello");
        assertEquals("ohelloo", val);
    }

    @Test
    public void backAround_a(){
        backAround b = new backAround();
        String val = b.backAround("a");
        assertEquals("aaa", val);
    }

    @Test
    public void backAround_not_aa(){
        backAround b = new backAround();
        String val = b.backAround("a");
        assertNotEquals("aa", val);
    }
}