import java.util.HashMap;

public class SubarraySumsDivisibleByK {
    public static void main(String[] args) {
        int[] nums = {-1,2,9};
        int k = 2;
        // int[] arr = {4,5,0,-2,-3,1};
        // int k = 5;
        // int[] arr = {2,-2,2,-4};
        // int k = 6;
        SubarraySumsDivisibleByK obj = new SubarraySumsDivisibleByK();
        System.out.println(obj.subarraysDivByK(nums, k));
    }
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int prefixSum = 0;
        map.put(0, 1);
        for(int i = 0; i<nums.length; i++){
            prefixSum += nums[i];
            int needed = ((prefixSum % k) + k) % k; 
            if(map.containsKey(needed)){
                count += map.get(needed);
            }
            map.put(((prefixSum % k) + k) % k, map.getOrDefault(((prefixSum % k) + k) % k, 0) + 1);
        }
        return count;
    }
}
