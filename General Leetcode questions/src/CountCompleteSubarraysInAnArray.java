
import java.util.HashMap;

public class CountCompleteSubarraysInAnArray {

    public static void main(String[] args) {
        int[] nums = {5,5,5,5};
        CountCompleteSubarraysInAnArray obj = new CountCompleteSubarraysInAnArray();
        System.out.println(obj.countCompleteSubarrays(nums));
    }

    public int countCompleteSubarrays(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int k = map.size();
        int left = 0;
        int right = 0;
        int completeSubarrayCount = 0;
        while (right < nums.length) {
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);
            while (freq.size() == k) {
                completeSubarrayCount = completeSubarrayCount + (nums.length - right);
                freq.put(nums[left], freq.get(nums[left]) - 1);
                if(freq.get(nums[left]) == 0){
                    freq.remove(nums[left]);
                }
                left++;
            }
            right++;
        }
        return completeSubarrayCount;
    }
}
