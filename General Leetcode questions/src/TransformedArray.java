import java.util.Arrays;

public class TransformedArray {
    public static void main(String[] args) {
        int[] nums = {-1,4,-1};
        TransformedArray obj = new TransformedArray();
        System.out.println(Arrays.toString(obj.constructTransformedArray(nums)));
    }
    public int[] constructTransformedArray(int[] nums) {
        int[] result = new int[nums.length];
        int n = result.length;
        for(int i = 0; i<result.length; i++){
            if(nums[i]>0){
                int index1 = (((i + nums[i]) % n) + n) % n;
                result[i] = nums[index1];
            } else if(nums[i]<0){
                int index2= (((i - Math.abs(nums[i])) % n) + n) % n;
                result[i] = nums[index2];
            } else {
                result[i] = nums[i];
            }
        }
        return result;
    }
}
