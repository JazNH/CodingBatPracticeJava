package warmup;

public class frontBack {

    // Given a string, return a new string where the first and last chars have been exchanged.
    //
    // frontBack("code") → "eodc"
    // frontBack("a") → "a"
    // frontBack("ab") → "ba"
    public String frontBack(String str) {
        StringBuilder sb = new StringBuilder(str);
        String newstr = str;
        if(str.length() >= 3){
            String first = str.substring(0,1);
            String last = str.substring(str.length() - 1);
            sb.deleteCharAt(str.length()-1);
            sb.deleteCharAt(0);
            return last + sb + first;
        } else if(str.length() == 2){
            String first = str.substring(0,1);
            sb.deleteCharAt(0);
            return sb+first;
        }
        return newstr;
    }

}
