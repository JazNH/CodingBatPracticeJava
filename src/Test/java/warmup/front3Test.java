package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class front3Test {

    @Test
    void front3_Java() {
        front3 f = new front3();
        String val = f.front3("Java");
        assertEquals("JavJavJav", val);
    }

    @Test
    void front3_Chocolate() {
        front3 f = new front3();
        String val = f.front3("Chocolate");
        assertEquals("ChoChoCho", val);
    }

    @Test
    void front3_abc() {
        front3 f = new front3();
        String val = f.front3("abc");
        assertEquals("abcabcabc", val);
    }

    @Test
    void front3_ab() {
        front3 f = new front3();
        String val = f.front3("ab");
        assertEquals("ab", val);
    }
}