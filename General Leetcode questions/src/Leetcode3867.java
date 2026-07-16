import java.util.Arrays;

public class Leetcode3867 {
  public long gcdSum(int[] nums) {
        int[] m = new int[nums.length];
        int prev = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length; i++){
            m[i] = Math.max(prev, nums[i]);
            prev = m[i];
        }
        int[] prefixGCD = new int[nums.length];
        for(int i = 0; i<prefixGCD.length; i++){
          prefixGCD[i] = findgcd(nums[i], m[i]);
        }
        Arrays.sort(prefixGCD);
        long ans = 0;
        for(int i = 0; i<prefixGCD.length /2 ; i++){
          ans += findgcd(prefixGCD[i], prefixGCD[prefixGCD.length - 1- i]);
        }
        
        return ans;    
    }

    // public int findgcd(int n1, int n2){
    //   while(n1 != 0 && n2 != 0){
    //     if(n1>n2){
    //       n1 = n1-n2;
    //     } else {
    //       n2 = n2 - n1;
    //     }
    //   }
    //   if(n1 == 0){
    //     return n2;
    //   } else {
    //     return n1;
    //   }
    // }

    public static int findgcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
      Leetcode3867 obj = new Leetcode3867();
      int[] nums = {3,6,2,8};
      System.out.println(obj.gcdSum(nums));
    }
}
