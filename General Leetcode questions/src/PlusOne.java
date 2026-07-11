import java.util.*;
public class PlusOne {
    public static void main(String[] args) {
        int[] arr =  {9,8,9};
        PlusOne obj = new PlusOne();
        System.out.println(Arrays.toString(obj.plusOne(arr)));

    }
    public int[] plusOne(int[] digits) {
        if(digits[digits.length - 1] < 9){
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        } else {
            for(int i = digits.length - 1; i>=0; i--){
                if(digits[i] == 9){
                    digits[i] = 0;
                }else {
                    digits[i] = digits[i] + 1;
                }
            }
        }
        System.out.println(Arrays.toString(digits));
        if(digits[0] == 0){
            int[] ans = new int[digits.length + 1];
            for(int i = digits.length - 1; i>=0; i--){
                ans[i + 1] = digits[i];
            }
            ans[0] = 1;
            Arrays.toString(ans);
            return ans;
        } else {
            return digits;
        }
    }
}
