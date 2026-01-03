public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        int[] nums = {-1};
        int k = 1;
        MaximumAverageSubarrayI obj = new MaximumAverageSubarrayI();
        System.out.println(obj.findMaxAverage(nums, k));
    }
    public double findMaxAverage(int[] nums, int k) {
        double currentAverage = 0;
        double maxAverage = Integer.MIN_VALUE;
        double window = 0;
        for(int i = 0; i<k; i++){
            window+=nums[i];
        }
        currentAverage = (double) (window / k );
        maxAverage = Math.max(maxAverage, currentAverage);
        for(int i = k; i<nums.length; i++){
            window+=nums[i];
            window-=nums[i-k];
            currentAverage = (double) (window / k);
            maxAverage = Math.max(maxAverage, currentAverage);
        }
        return maxAverage;
    }
}
