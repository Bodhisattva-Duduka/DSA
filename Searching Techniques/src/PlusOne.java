
import java.util.Arrays;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        } else {
            for (int i = digits.length - 2; i >= 0; i--) {
                if (digits[digits.length - 1] != 9) {
                    digits[digits.length - 1] = digits[digits.length - 1] + 1;
                    return digits;
                } else {
                    digits[i] = 0;
                }
            }
        }
        return new int[]{-1};
    }

    public static void main(String[] args) {
        int[] digits = {3, 5, 9};
        PlusOne obj = new PlusOne();
        System.out.println(Arrays.toString(obj.plusOne(digits)));
    }
}
