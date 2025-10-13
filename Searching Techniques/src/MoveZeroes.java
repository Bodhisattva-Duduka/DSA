import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 0};
        moveZeroesToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroesToEnd(int[] nums) {
        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }
}
