package warmup;

public class front3 {

    // Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less
    // than 3, the front is whatever is there. Return a new string which is 3 copies of the front.
    //
    // front3("Java") → "JavJavJav"
    // front3("Chocolate") → "ChoChoCho"
    // front3("abc") → "abcabcabc"
    public String front3(String str) {

        if(str.length() >= 3) {
            String three = str.substring(0,3);
            return three + three + three;
        } else if (str.length() == 2) {
            String two = str.substring(0,2);
            return two + two + two;
        } else if (str.length() == 1) {
            String one = str.substring(0,1);
            return one + one + one;
        }
        return  str;
    }

}
