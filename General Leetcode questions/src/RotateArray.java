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

    // optimal
    // using reversing the array

    public void rotate2(int[] nums, int k) {
        int n = nums.length;
        k = k % n;   // handle k > n

        reverse(nums, 0, n - 1);   // step 1
        reverse(nums, 0, k - 1);   // step 2
        reverse(nums, k, n - 1);   // step 3
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
