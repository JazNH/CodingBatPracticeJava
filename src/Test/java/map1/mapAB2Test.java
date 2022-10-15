package map1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class mapAB2Test {

    // mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
    // mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
    // mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}

    @Test
    void mapAB2_remove() {
        mapAB2 m = new mapAB2();
        Map<String, String> input = new HashMap<>() {{
           put("a", "aaa");
           put("b", "aaa");
           put("c", "cake");
        }};
        Map<String, String> expected = new HashMap<>() {{
            put("c", "cake");
        }};
        Map<String, String> val = m.mapAB2(input);
        assertEquals(expected, val);
    }

    @Test
    void mapAB2_same() {
        mapAB2 m = new mapAB2();
        Map<String, String> input = new HashMap<>() {{
            put("a", "aaa");
            put("b", "bbb");
        }};
        Map<String, String> expected = new HashMap<>() {{
            put("a", "aaa");
            put("b", "bbb");
        }};
        Map<String, String> val = m.mapAB2(input);
        assertEquals(expected, val);
    }

    @Test
    void mapAB2_same2() {
        mapAB2 m = new mapAB2();
        Map<String, String> input = new HashMap<>() {{
            put("a", "aaa");
            put("b", "bbb");
            put("c", "ccc");
        }};
        Map<String, String> expected = new HashMap<>() {{
            put("a", "aaa");
            put("b", "bbb");
            put("c", "ccc");
        }};
        Map<String, String> val = m.mapAB2(input);
        assertEquals(expected, val);
    }
}