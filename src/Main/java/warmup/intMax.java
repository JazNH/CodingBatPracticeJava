package warmup;

public class intMax {

    // Given three int values, a b c, return the largest.
    //
    // intMax(1, 2, 3) → 3
    // intMax(1, 3, 2) → 3
    // intMax(3, 2, 1) → 3
    public int intMax(int a, int b, int c) {
        int firstMax = Math.max(a,b);
        int secondMax = Math.max(b,c);
        return Math.max(firstMax,secondMax);
    }

}
