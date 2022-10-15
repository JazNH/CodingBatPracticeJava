package map1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class mapShareTest {
    // mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
    // mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
    // mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}

    @Test
    void mapShare_first() {
        mapShare m = new mapShare();
        Map<String, String> input = new HashMap<>() {{
           put("a", "aaa");
           put("b", "bbb");
           put("c", "ccc");
        }};
        Map<String, String> expected = new HashMap<>() {{
            put("a", "aaa");
            put("b", "aaa");
        }};
        Map<String, String> val = m.mapShare(input);
        assertEquals(expected, val);
    }

    @Test
    void mapShare_second() {
        mapShare m = new mapShare();
        Map<String, String> input = new HashMap<>() {{
            put("b", "xyz");
            put("c", "ccc");
        }};
        Map<String, String> expected = new HashMap<>() {{
            put("b", "xyz");
        }};
        Map<String, String> val = m.mapShare(input);
        assertEquals(expected, val);
    }

    @Test
    void mapShare_third() {
        mapShare m = new mapShare();
        Map<String, String> input = new HashMap<>() {{
            put("a", "aaa");
            put("c", "meh");
            put("d", "hi");
        }};
        Map<String, String> expected = new HashMap<>() {{
            put("a", "aaa");
            put("b", "aaa");
            put("d", "hi");
        }};
        Map<String, String> val = m.mapShare(input);
        assertEquals(expected, val);
    }
}