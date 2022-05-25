package warmup;

public class diff21 {

    // Given an int n, return the absolute difference between n and 21,
    // except return double the absolute difference if n is over 21.
    public int diff21(int n) {
        int ans;
        if (n <= 21) {
            ans = 21 - n;
        } else {
            ans = (n - 21) *2;
        }
        return ans;
    }
}
