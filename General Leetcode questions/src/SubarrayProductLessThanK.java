public class SubarrayProductLessThanK {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 1;
        SubarrayProductLessThanK obj = new SubarrayProductLessThanK();
        System.out.println(obj.numSubarrayProductLessThanK(nums, k));
    }
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k == 0){
            return 0;
        }
        int productWindow = 1;
        int left = 0;
        int right = 0;
        int subArrayCount = 0;
        while(right<nums.length){
            if(productWindow<k){
                productWindow*=nums[right];
                if(productWindow<k){
                    subArrayCount++;
                }
            }
            while(productWindow>=k){
                productWindow/=nums[left];
                left++;
                if(productWindow<k){
                    subArrayCount++;
                }
            }
            right++;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<k){
                subArrayCount++;
            }
        }
        return subArrayCount;
    }
}
