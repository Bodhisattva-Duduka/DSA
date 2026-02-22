import java.util.Arrays;

public class Leetcode1752 {
    public boolean check(int[] nums) {
        int[] B = new int[nums.length];
        int min = nums[0];
        for(int i = 0; i<nums.length; i++){
            min = Math.min(nums[i], min);
        }
        int index = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == min){
                index = i;
                break;
            }
        }
        int n = B.length;
        for(int i = 0; i<n; i++){
            B[(((i - index)%n)+n)%n] = nums[i];
            System.out.println(Arrays.toString(B));
        }
        System.out.println(Arrays.toString(B));
        int j = 1;
        for(int i = 0; i<B.length && j<B.length; i++){
            if(B[i]>B[j]){
                return false;
            }
            j++;    
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {6,10,6};
        Leetcode1752 obj = new Leetcode1752();
        System.out.println(obj.check(nums));
    }
}
