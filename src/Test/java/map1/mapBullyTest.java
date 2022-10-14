package map1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class mapBullyTest {

    // mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
    // mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
    // mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}

    @Test
    void mapBully() {
        mapBully b = new mapBully();
        Map<String, String> input = new HashMap<String, String>() {{
            put("a", "candy");
            put("b", "dirt");
        }};
        Map<String, String> expected = new HashMap<String, String>() {{
            put("a", "");
            put("b", "candy");
        }};
        Map<String, String> val = b.mapBully(input);
        assertEquals(expected, val);
    }
}