import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {-1,1};
        int k = 5;
        RotateArray obj = new RotateArray();
        obj.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
    public void rotate(int[] nums, int k) {
        int[] arr = new int[nums.length];
        int index = 0;
        int secondIndex = 0;
        for(int i = 0; i<nums.length; i++){
            index = i+k;
            if(index<nums.length){
                arr[index] = nums[i];
            }
            else {
                secondIndex = k - (arr.length - i);
                while(secondIndex>=arr.length){
                    secondIndex = secondIndex - arr.length;
                }
                arr[secondIndex] = nums[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }
    }
}
