import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        FindAllDuplicatesInAnArray obj = new FindAllDuplicatesInAnArray();
        System.out.println(obj.findDuplicates(arr));
        // {1,2,3,4,2,3,7,8}
    }

    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i ,correct);
            }
            else {
                i++;
            }
        }

        List<Integer> arr = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            int value = j + 1;
            if (nums[j] != value){
                arr.add(nums[j]);
            }
        }
        return arr;
    }

    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
