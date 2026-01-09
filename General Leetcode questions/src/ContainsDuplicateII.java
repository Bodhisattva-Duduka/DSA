import java.util.*;
public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        int k = 3;
        ContainsDuplicateII obj = new ContainsDuplicateII();
        System.out.println(obj.containsNearbyDuplicate(arr, k));
    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i]) && i - map.get(nums[i]) <= k){
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
