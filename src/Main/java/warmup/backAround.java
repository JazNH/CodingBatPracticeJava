package warmup;

public class backAround {

    // Given a string, take the last char and return a new string with the last char added at the front and back,
    // so "cat" yields "tcatt". The original string will be length 1 or more.
    public String backAround(String str) {
        String last = str.substring(str.length() - 1);
        StringBuilder newstr = new StringBuilder();
        newstr = newstr.append(last).append(str).append(last);
        return newstr.toString();
    }
}
