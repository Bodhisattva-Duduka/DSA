
public class Leetcode2239 {
    public static void main(String[] args) {
        int[] nums = {2,-1,1};
        Leetcode2239 obj = new Leetcode2239();
        System.out.println(obj.findClosestNumber(nums));
    }
    public int findClosestNumber(int[] nums) {
        int currDis = Math.abs(nums[0]);
        int ans = nums[0];
        int minDis = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++){
            currDis = Math.abs(nums[i]);
            if(currDis<minDis){
                minDis = currDis;
                ans = nums[i];
            }
        }
        if(ans>=0){
            return ans;
        } else {
            for(int i = 0; i<nums.length; i++){
                if(Math.abs(ans) == nums[i]){
                    ans = nums[i];
                }
            }
            return ans;
        }
    }
}