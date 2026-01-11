import java.util.*;

public class SplitTheArray {
    public static void main(String[] args) {
        int[] nums = {6,1,3,1,1,8,9,2};
        SplitTheArray obj = new SplitTheArray();
        System.out.println(obj.isPossibleToSplit(nums));
    }
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(freq.containsKey(nums[i]) && freq.get(nums[i])>2){
                return false;
            }
            else {
                freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            }
        }
        for(Map.Entry<Integer, Integer> e : freq.entrySet()){
            if(e.getValue() > 2){
                return false;
            }
        }
        return true;
    }
}
