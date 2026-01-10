public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        MaxConsecutiveOnesIII obj = new MaxConsecutiveOnesIII();
        System.out.println(obj.longestOnes(arr, k));
    }
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int currentLength = 0;
        int maxLength = 0;
        int bitCount = 0;
        while(right<nums.length){
            if(nums[right] == 0){
                bitCount++;
            }
            currentLength++;
            while(bitCount>k){
                if(nums[left] == 0){
                    bitCount--;
                }
                currentLength--;
                left++;
            }
            maxLength = Math.max(currentLength, maxLength);
            right++;
        }
        return maxLength;
    }
}
