package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class frontBackTest {

    @Test
    void frontBack_code() {
        frontBack f = new frontBack();
        String val  =  f.frontBack("code");
        assertEquals( "eodc", val);
    }

    @Test
    void frontBack_a() {
        frontBack f = new frontBack();
        String val  =  f.frontBack("a");
        assertEquals( "a", val);
    }

    @Test
    void frontBack_ab() {
        frontBack f = new frontBack();
        String val  =  f.frontBack("ab");
        assertEquals( "ba", val);
    }

}