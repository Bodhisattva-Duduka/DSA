public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        MinimumSizeSubarraySum obj = new MinimumSizeSubarraySum();
        System.out.println(obj.minSubArrayLen(target, nums));
    }
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int currentMin = 0;
        int min = Integer.MAX_VALUE;
        boolean bool = true;
        while(right<nums.length){
            if(sum<target){
                sum+=nums[right];
            }
            while(sum>=target){
                currentMin = right - left + 1;
                if(currentMin<=min){
                    min = currentMin;
                }
                sum-=nums[left];
                left++;
                bool = false;
            }
            right++;
        }
        if(!bool){
            return min;
        }
        else {
            return 0;
        }
    }
}
