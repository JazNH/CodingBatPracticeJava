package warmup;

public class posNeg {

    // Given 2 int values, return true if one is negative and one is positive.
    // Except if the parameter "negative" is true, then return true only if both are negative.
    //
    // posNeg(1, -1, false) → true
    // posNeg(-1, 1, false) → true
    // posNeg(-4, -5, true) → true
    // posNeg(-4, -5, false) → false
    public boolean posNeg(int a, int b, boolean negative) {
        if(a<0 & b<0 & negative) {
            return true;
        } else if (a<0 && b<0 & !negative) {
            return false;
        } else if (a<0 && b>0 & negative) {
            return false;
        } else if (a<0 || b<0 & !negative) {
            return true;
        }
        return false;
    }

}
