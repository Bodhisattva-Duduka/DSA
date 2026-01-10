import java.util.*;
public class Leetcode2958 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3,1,2};
        int k = 2;
        Leetcode2958 obj = new Leetcode2958();
        System.out.println(obj.maxSubarrayLength(nums, k));
    }
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int left = 0;
        int right = 0;
        int currentLength = 0;
        int maxLength = 0;
        while(right<nums.length){
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);
            currentLength++;
            while(freq.get(nums[right]) > k){
                freq.put(nums[left], freq.get(nums[left]) - 1);
                currentLength--;
                left++;
            }
            maxLength = Math.max(currentLength, maxLength);
            right++;
        }
        return maxLength;
    }
}
