
public class PlusOne {
    public static void main(String[] args) {
        int[] arr =  {9,9,9};
        PlusOne obj = new PlusOne();
        obj.plusOne(arr);
    }
    public int[] plusOne(int[] digits) {
        String s = "";
        for (int i = 0; i < digits.length; i++) {
            s = s + Integer.toString(digits[i]);
        }
        int toInt = Integer.parseInt(s) + 1;
        String str = Integer.toString(toInt);
        int[] ans = new int[str.length()];
        for (int i = 0; i < ans.length; i++) {
            String strNum = str.valueOf(str.charAt(i));
            ans[i] = Integer.parseInt(strNum);
        }
        return ans;
    }
}
