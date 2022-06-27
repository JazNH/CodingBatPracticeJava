package string;

public class endsLy {

    // Given a string, return true if it ends in "ly".
    //
    // endsLy("oddly") → true
    // endsLy("y") → false
    // endsLy("oddy") → false
    public boolean endsLy(String str) {
        if(str.length() >=2){
            String a = str.substring(str.length()-2, str.length());
            if(a.contains("ly")){
                return true;
            }
        }
        return false;
    }

}
