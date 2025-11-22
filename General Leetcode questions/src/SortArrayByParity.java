import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {2,5,74,8,4,0,1};
        SortArrayByParity obj = new SortArrayByParity();
        System.out.println(Arrays.toString(obj.sortArrayByParity(nums)));
     }
    public int[] sortArrayByParity(int[] nums) {
        int Pointer = 0;
        int[] arr = new int[nums.length];
        int i = 0;
        int j = 0;
        while(Pointer<nums.length){
            if (nums[Pointer]%2 == 0){
                arr[i] = nums[Pointer];
                i++;
            }
            if (nums[Pointer]%2 != 0){
                arr[arr.length - 1 - j] = nums[Pointer];
                j++;
            }
            Pointer++;
        }
        return arr;
    }
}
