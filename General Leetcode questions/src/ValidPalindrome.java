
public class ValidPalindrome {

    public static void main(String[] args) {
        String str = "0P";
        ValidPalindrome obj = new ValidPalindrome();
        System.out.println(obj.isPalindrome(str));
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^A-Za-z0-9]", "");
        int left = 0;
        int right = s.length() - 1;
        boolean bool = true;
        while (left <= right && bool) {
            if (s.charAt(left) != s.charAt(right)){
                bool = false;
            }
            left++;
            right--;
        }
        return bool;
    }
}
