package map1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class topping1Test {

    // topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
    // topping1({}) → {"bread": "butter"}
    // topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}

    @Test
    void topping1_cherry_swap() {
        topping1 t = new topping1();
        Map<String, String> input = new HashMap<String, String>() {{
            put("ice cream", "peanuts");
        }};
        Map<String, String> expected = new HashMap<String, String>() {{
            put("bread", "butter");
            put("ice cream", "cherry");
        }};
        Map<String, String> val = t.topping1(input);
        assertEquals(expected, val);
    }

    @Test
    void topping1_no_icecream() {
        topping1 t = new topping1();
        Map<String, String> input = new HashMap<String, String>() {{
        }};
        Map<String, String> expected = new HashMap<String, String>() {{
            put("bread", "butter");
        }};
        Map<String, String> val = t.topping1(input);
        assertEquals(expected, val);
    }

    @Test
    void topping1_neitherCase() {
        topping1 t = new topping1();
        Map<String, String> input = new HashMap<String, String>() {{
            put("pancake", "syrup");
        }};
        Map<String, String> expected = new HashMap<String, String>() {{
            put("bread", "butter");
            put("pancake", "syrup");
        }};
        Map<String, String> val = t.topping1(input);
        assertEquals(expected, val);
    }
}