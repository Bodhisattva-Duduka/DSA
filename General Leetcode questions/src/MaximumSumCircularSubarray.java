
public class MaximumSumCircularSubarray {

    public static void main(String[] args) {
        int[] nums = {-3,-2,-3};
        MaximumSumCircularSubarray obj = new MaximumSumCircularSubarray();
        System.out.println(obj.maxSubarraySumCircular(nums));
    }

    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        for(int i = 0; i<nums.length; i++){
            totalSum += nums[i];
        }
        int currentSum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            currentSum += nums[i];

            if(currentSum>max){
                max = currentSum;
            }

            if(currentSum<0){
                currentSum = 0;
            }
        }
        currentSum = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++){
            currentSum += nums[i];
            
            if(currentSum<min){
                min = currentSum;
            }

            if(currentSum>0){
                currentSum = 0;
            }
        }
        if(max<0) {
            return max;
        }
        return Math.max(totalSum - min, max);
    }
}
