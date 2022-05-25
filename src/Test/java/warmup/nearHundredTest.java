package warmup;

import warmup.nearHundred;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class nearHundredTest {

    @Test
    public void nearHundred_93(){
        nearHundred n = new nearHundred();
        boolean val = n.nearHundred(93);
        assertEquals(true, val);
    }

    @Test
    public void nearHundred_90(){
        nearHundred n = new nearHundred();
        boolean val = n.nearHundred(90);
        assertEquals(true, val);
    }

    @Test
    public void nearHundred_89(){
        nearHundred n = new nearHundred();
        boolean val = n.nearHundred(89);
        assertEquals(false, val);
    }
}