public class SubarrayProductLessThanK {
    public static void main(String[] args) {
        int[] nums = {10,5,2,6};
        int k = 100;
        SubarrayProductLessThanK obj = new SubarrayProductLessThanK();
        System.out.println(obj.numSubarrayProductLessThanK(nums, k));
    }
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k == 0){
            return 0;
        }
        int left = 0;
        int right = 0;
        int product = 1;
        int subArrayCount = 0;
        while(right<nums.length){
            product *= nums[right];
            while(product>=k && left<=right){
                product /= nums[left];
                left++;
            }
            subArrayCount += (right - left + 1);
            right++;
        }
        return subArrayCount;
    }
}
