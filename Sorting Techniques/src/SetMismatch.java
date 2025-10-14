import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        SetMismatch obj = new SetMismatch();
        System.out.println(Arrays.toString(obj.findErrorNums(arr)));
        // {1,2,2,4}
    }
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i<nums.length){
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else {
                i++;
            }
        }

        int[] arr = new int[2];
        for (int j = 0; j < nums.length; j++) {
            int value = j + 1;
            if (nums[j] != value){
                arr[0] = nums[j];
                arr[1] = value;
            }
        }
        return arr;
    }
    public static void swap(int[] nums , int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
