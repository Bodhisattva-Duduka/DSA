import java.util.ArrayDeque;
import java.util.Deque;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        BackspaceStringCompare obj = new BackspaceStringCompare();
        System.out.println(obj.backspaceCompare(s, t));
    }
    public boolean backspaceCompare(String s, String t) {
        Deque<Character> stack1 = new ArrayDeque<>();
        Deque<Character> stack2 = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            if(!stack1.isEmpty() && ch == '#'){
                stack1.pop();
            } else {
                stack1.push(ch);
            }
        }
        for(char ch : t.toCharArray()){
            if(!stack2.isEmpty() && ch == '#'){
                stack2.pop();
            } else {
                stack2.push(ch);
            }
        }
        return stack1.equals(stack2);
    }
}
