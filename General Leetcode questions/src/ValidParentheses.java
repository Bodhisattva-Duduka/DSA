import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses obj = new ValidParentheses();
        String s = "([])(]";
        System.out.println(obj.isValid(s));
    }
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i<s.length(); i++){
            if(stack.isEmpty() && (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')){
                return false;
            } else if((!stack.isEmpty()) && stack.peek() == '(' && (s.charAt(i) == '}' || s.charAt(i) == ']')){
                return false;
            } else if((!stack.isEmpty()) && stack.peek() == '{' && (s.charAt(i) == ')' || s.charAt(i) == ']')){
                return false;
            } else if((!stack.isEmpty()) && stack.peek() == '[' && (s.charAt(i) == ')' || s.charAt(i) == '}')){
                return false;
            }
            if((!stack.isEmpty()) && ((stack.peek() == '(' && s.charAt(i) == ')') || (stack.peek() == '{' && s.charAt(i) == '}') || (stack.peek() == '[' && s.charAt(i) == ']'))){
                stack.pop();   
            }
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
        }
        if(stack.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}
