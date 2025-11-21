import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] arr = {-7,-3,2,3,11};
        SquaresOfSortedArray obj = new SquaresOfSortedArray();
        System.out.println(Arrays.toString(obj.sortedSquares(arr)));
    }
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] arr = new int[nums.length];
        int i = nums.length - 1;
        while(left<=right){
            if (Math.pow(nums[left], 2) == Math.pow(nums[right], 2)){
                arr[i] = (int) Math.pow(nums[right], 2);
                right--;
                i--;
            }
            else if(Math.pow(nums[left], 2) < Math.pow(nums[right], 2)){
                arr[i] = (int) Math.pow(nums[right], 2);
                right--;
                i--;
            }
            else {
                arr[i] = (int) Math.pow(nums[left], 2);
                left++;
                i--;
            }
        }
        return arr;
    }
}
