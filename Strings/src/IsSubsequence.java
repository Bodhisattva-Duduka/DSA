public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true;
        }
        if(s.length() > t.length()){
            return false;
        }
        int first = 0;
        int second = 0;
        while(second<t.length()){
            if(s.charAt(first) == t.charAt(second)){
                first++;
                if(first == s.length()){
                    return true;
                }
            }
            second++;
        }
        if(first == s.length()){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        IsSubsequence obj = new IsSubsequence();
        System.out.println(obj.isSubsequence(s, t));
    }
}
