package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class missingCharTest {

    @Test
    public void missingCharTest_ktten() {
        missingChar m = new missingChar();
        String val = m.missingChar("kitten", 1);
        assertEquals("ktten", val);
    }

    @Test
    public void missingCharTest_itten() {
        missingChar m = new missingChar();
        String val = m.missingChar("kitten", 0);
        assertEquals("itten", val);
    }

    @Test
    public void missingCharTest_kittn() {
        missingChar m = new missingChar();
        String val = m.missingChar("kitten", 4);
        assertEquals("kittn", val);
    }
}