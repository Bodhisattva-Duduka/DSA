import java.util.Arrays;

public class RotateArrayGFG {
    public static void main(String[] args){
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int d = 3;
        rotateArr(arr, d);
        System.out.println(Arrays.toString(arr));
    }
    static void rotateArr(int arr[], int d) {
        int[] nums = new int[arr.length];
        int n = arr.length;
        for(int i = 0; i<nums.length; i++){
            int k = i - d;
            int index = (((k) % n) + n) % n;
            nums[index] = arr[i];
        }
        for(int i = 0; i<arr.length; i++){
            arr[i] = nums[i];
            System.out.println(arr[i]);
        }
    }
}
