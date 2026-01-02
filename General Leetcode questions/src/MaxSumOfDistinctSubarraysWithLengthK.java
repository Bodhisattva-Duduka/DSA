public class MaxSumOfDistinctSubarraysWithLengthK {
    public static void main(String[] args) {
        int[] nums = {11,11,7,2,9,4,17,1};
        int k = 1;
        MaxSumOfDistinctSubarraysWithLengthK obj = new MaxSumOfDistinctSubarraysWithLengthK();
        System.out.println(obj.maximumSubarraySum(nums, k));
    }
    public long maximumSubarraySum(int[] nums, int k) {
        int max = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        int[] freq = new int[max + 1];
        long windowSum = 0;
        long maxWindowSum = 0;
        int duplicateCounter = 0;
        for(int i = 0; i<k; i++){
            windowSum+=nums[i];
            freq[nums[i]]++;
            if(freq[nums[i]]>1){
                duplicateCounter++;
            }
        }
        if(duplicateCounter == 0 && windowSum > maxWindowSum){
            maxWindowSum = windowSum;
        }
        for(int i = k; i<nums.length; i++){
            windowSum+=nums[i];
            windowSum-=nums[i-k];
            freq[nums[i]]++;
            freq[nums[i-k]]--;
            if(freq[nums[i]] > 1){
                duplicateCounter++;
            }
            if(freq[nums[i-k]] >= 1 && duplicateCounter>0){
                duplicateCounter--;
            }
            if(duplicateCounter == 0 && windowSum > maxWindowSum){
                maxWindowSum = windowSum;
            }
        }
        return maxWindowSum;
    }
}
