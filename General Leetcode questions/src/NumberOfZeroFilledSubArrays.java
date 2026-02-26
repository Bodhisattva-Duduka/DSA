public class NumberOfZeroFilledSubArrays {
    public static void main(String[] args) {
        NumberOfZeroFilledSubArrays obj = new NumberOfZeroFilledSubArrays();
        int[] nums = {1,3,0,0,2,0,0,4};
        int[] arr = {0,-9,6,-5,0,0,8,0,0,3,-3};
        System.out.println(obj.zeroFilledSubarray(arr));
    }
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        long count = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0){
                ans += (count * (count + 1))/2;
                count = 0;
            }
            if(nums[i] == 0){
                count++;
            }
        }
        if(nums[nums.length - 1] == 0){
            ans += (count * (count + 1))/2;
        }
        return ans;       
    }
}
