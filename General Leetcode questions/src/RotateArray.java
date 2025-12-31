import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        RotateArray obj = new RotateArray();
        obj.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
    public void rotate(int[] nums, int k) {
        int[] arr = new int[nums.length];
        int n = arr.length;
        int index = 0;
        for(int i = 0; i<nums.length; i++){
            index = (k + i) % n;
            arr[index] = nums[i];
        }
        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }
    }
}
