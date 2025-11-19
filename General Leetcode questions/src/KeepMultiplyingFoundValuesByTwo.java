public class KeepMultiplyingFoundValuesByTwo {
    public static void main(String[] args) {
        int[] nums = {5,3,6,1,12};
        // int[] arr = {8,19,4,2,15,3};
        // int original2 = 2;
        int original = 3;
        KeepMultiplyingFoundValuesByTwo obj = new KeepMultiplyingFoundValuesByTwo();
        System.out.println(obj.findFinalValue(nums, original));
    }
    public int findFinalValue(int[] nums, int original) {
        int value ;
        for(int i = 0; i<nums.length; i++){
            value = nums[i];
            if (value == original){
                original = original * 2;
                i = -1;
            }
        }
        return original;
    }
}