
public class missingNumber {

    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(findMissingNumber(nums));
    }

    public static int findMissingNumber(int[] nums) {
        int actualSum = (nums.length) * (nums.length+1) / 2;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return actualSum - sum;

    }
}
