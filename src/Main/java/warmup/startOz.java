package warmup;

public class startOz {

    // Given a string, return a string made of the first 2 chars (if present),
    // however include first char only if it is 'o' and include the second only if it is 'z',
    // so "ozymandias" yields "oz".
    //
    // startOz("ozymandias") → "oz"
    // startOz("bzoo") → "z"
    // startOz("oxx") → "o"
    public String startOz(String str) {
        String toReturn = "";
        if(str.length() >= 2) {
            String first = str.substring(0,1);
            String second = str.substring(1,2);
            if(str.startsWith("oz")) {
                toReturn = "oz";
            } else if(first.equals("o")) {
                toReturn = first;
            } else if(second.equals("z")) {
                toReturn = second;
            }
        } else {
            toReturn = str;
        }
        return toReturn;
    }

}
