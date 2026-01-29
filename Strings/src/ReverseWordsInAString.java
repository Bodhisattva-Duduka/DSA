// Approach 1

public class ReverseWordsInAString {
    public String reverseWords1(String s) {
        String str = s.strip();
        int slow = str.length() - 1;
        int fast = str.length() - 1;
        StringBuilder answer = new StringBuilder();
        boolean bool = false;
        while(fast>=0){
            if (Character.isWhitespace(str.charAt(fast))){
                answer.append(str.substring(fast + 1, slow)).append(" ");
                slow = fast + 1;
                bool = false;
            }
            if(!bool){
                slow = fast;
                bool = true;
            }
            fast--;
        }
        return answer.toString().strip();
    }

    // Approach 2
    public String reverseWords2(String s) {
        String str = s.strip();
        // int slow = str.length() - 1;
        // int fast = str.length() - 1;
        StringBuilder answer = new StringBuilder();
        String[] result = str.split(" ");
        for(int i = result.length - 1; i>=0; i--){
            if (!("".equals(result[i]))){
                answer.append(result[i].strip()).append(" ");
            }
        }
        return answer.toString().strip();
    }
    public static void main(String[] args) {
        String s = "  the    sky    is   blue  ";
        ReverseWordsInAString obj = new ReverseWordsInAString();
        System.out.println(obj.reverseWords2(s));
    }
}
