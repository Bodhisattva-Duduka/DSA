import java.util.ArrayList;

public class Leetcode3507 {
    public static void main(String[] args) {
        int[] nums = {5,6,9,2,3};
        Leetcode3507 obj = new Leetcode3507();
        System.out.println(obj.minimumPairRemoval(nums));
    }
    public int minimumPairRemoval(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            arr.add(nums[i]);
        }
        int firstPointer = 0;
        int secondPointer = 1;
        int sum = 0;
        int minSum = Integer.MAX_VALUE;
        int minSumIndex = 0;
        boolean sorted = true;
        int count = 0;
        while(secondPointer<arr.size()){
            sum = arr.get(firstPointer) + arr.get(secondPointer);
            if(sum<minSum){
                minSumIndex = firstPointer;
                minSum = sum;
            }
            if(arr.get(firstPointer) > arr.get(secondPointer)){
                sorted = false;
            }
            if(!(sorted) && secondPointer == arr.size()-1){
                arr.remove(minSumIndex + 1);
                arr.set(minSumIndex, minSum);
                minSum = Integer.MAX_VALUE;
                count++;
                sorted = true;
                firstPointer = -1;
                secondPointer = 0;
            }
            firstPointer++;
            secondPointer++;
        }
        return count;
    }
}
