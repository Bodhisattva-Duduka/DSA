import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Leetcode3834 {
  public static void main(String[] args) {
    Leetcode3834 obj = new Leetcode3834();
    int[] nums = {3,7,5};
    System.out.println(obj.mergeAdjacent(nums).toString());
  }
  public List<Long> mergeAdjacent(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i<nums.length; i++){
            int curr = nums[i];
            if(!stack.isEmpty() && curr == stack.peek()){
                stack.push(curr);
                int top = stack.peek();
                while(!stack.isEmpty() && curr == top){
                    curr = curr + stack.peek();
                    stack.pop();
                    stack.pop();
                    if(!stack.isEmpty()){
                        top = stack.peek();
                    }
                    if(stack.isEmpty()){
                      stack.push(curr);
                      break;
                    }
                    stack.push(curr);
                }
            } else {
                stack.push(nums[i]);
            }
        }
        List<Long> ans = new ArrayList<>();
        while(!stack.isEmpty()){
            ans.add(0, (long) stack.pop());
        }
        return ans;
    }
}
