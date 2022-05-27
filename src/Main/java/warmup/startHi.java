package warmup;

public class startHi {

    //Given a string, return true if the string starts with "hi" and false otherwise.

    public boolean startHi(String str) {
        if(str.length() >= 2) {
            String hi = str.substring(0, 2);
            if(hi.length() >= 2 && hi.contains("hi")) {
                return true;
            }
        }
        return false;
    }

}
