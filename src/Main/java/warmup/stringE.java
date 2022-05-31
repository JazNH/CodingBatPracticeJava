package warmup;

public class stringE {

    // Return true if the given string contains between 1 and 3 'e' chars.
    //
    // stringE("Hello") → true
    // stringE("Heelle") → true
    // stringE("Heelele") → false

    public boolean stringE(String str) {
        int counter = 0;
        char ch = 'e';
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch) {
                counter++;
            }
        }
        return counter >= 1 && counter <= 3;
    }
}
