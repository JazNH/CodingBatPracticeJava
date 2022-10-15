package map1;

import java.util.Map;

public class mapShare {

    // Modify and return the given map as follows: if the key "a" has a value, set the
    // key "b" to have that same value. In all cases remove the key "c", leaving the
    // rest of the map unchanged.
    //
    // mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
    // mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
    // mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}

    public Map<String, String> mapShare(Map<String, String> map) {
        String a = map.get("a");
        String c = map.get("c");
        if(map.containsKey("b")) {
            if(map.containsKey("a")){
                map.put("b", a);
            }
        }
        if(map.containsKey("c")) {
            map.remove("c",c);
        }
        if(!map.containsKey("b")){
            map.put("b",a);
        }
        return map;
    }

}
