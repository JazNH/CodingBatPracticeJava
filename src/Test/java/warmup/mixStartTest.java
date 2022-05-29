package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mixStartTest {

    @Test
    public void mixStart_mix(){
        mixStart m = new mixStart();
        boolean val = m.mixStart("mix snacks");
        assertEquals(true, val);
    }

    @Test
    public void mixStart_pix(){
        mixStart m = new mixStart();
        boolean val = m.mixStart("pix snacks");
        assertEquals(true, val);
    }

    @Test
    public void mixStart_piz(){
        mixStart m = new mixStart();
        boolean val = m.mixStart("piz snacks");
        assertEquals(false, val);
    }

    @Test
    public void mixStart_ix(){
        mixStart m = new mixStart();
        boolean val = m.mixStart("ix");
        assertEquals(false, val);
    }
}