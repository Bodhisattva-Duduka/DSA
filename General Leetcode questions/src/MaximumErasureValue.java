public class MaximumErasureValue {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,4,3,1};
        MaximumErasureValue obj = new MaximumErasureValue();
        System.out.println(obj.maximumUniqueSubarray(nums));
    }
    public int maximumUniqueSubarray(int[] nums) {
        int[] freq = new int[10001];
        int left = 0;
        int right = 0;
        int currentErasure = 0;
        int maxErasure = 0;
        while(right<nums.length){
            freq[nums[right]]++;
            currentErasure+=nums[right];

            while(freq[nums[right]]>1){
                freq[nums[left]]--;
                currentErasure-=nums[left];
                left++;
            }

            maxErasure = Math.max(currentErasure, maxErasure);
            right++;
        }
        return maxErasure;
    }
}
