
public class FindTheDuplicateNumber {

    public static void main(String[] args) {
        int[] arr = {3,3,3,3,3};
        // {1,2,3,4,2}
        FindTheDuplicateNumber obj = new FindTheDuplicateNumber();
        System.out.println(obj.findDuplicate(arr));
    }

    public int findDuplicate(int[] nums) {
        int i = 0;
        while (i<nums.length){
            int correct = nums[i] - 1;
            if (nums[i]<nums.length && nums[i] != nums[correct]){
                swap(nums , i ,correct);
            }
            else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            int value = j + 1;
            if (nums[j] != value){
                return nums[j];
            }
        }
        return -1;
        // System.out.println(Arrays.toString(nums));
    }
    public static void swap(int[] nums , int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
