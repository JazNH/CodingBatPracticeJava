package map1;

import java.util.Map;

public class mapAB2 {

    // Modify and return the given map as follows: if the keys "a" and "b" are both in the
    // map and have equal values, remove them both.
    //
    // mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
    // mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
    // mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
    public Map<String, String> mapAB2(Map<String, String> map) {
        String one = map.get("a");
        String two = map.get("b");
        if (one != null && two != null && one.equals(two)) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

}
