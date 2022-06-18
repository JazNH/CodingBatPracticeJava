package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class delDelTest {

    @Test
    void delDel_abc() {
        delDel d = new delDel();
        String val = d.delDel("adelbc");
        assertEquals("abc", val);
    }

    @Test
    void delDel_aHello() {
        delDel d = new delDel();
        String val = d.delDel("adelHello");
        assertEquals("aHello", val);
    }

    @Test
    void delDel_adedbc() {
        delDel d = new delDel();
        String val = d.delDel("adedbc");
        assertEquals("adedbc", val);
    }
}