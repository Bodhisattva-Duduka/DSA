
public class ReverseVowelsOfAString {

    public static void main(String[] args) {
        String s = "leetcode";
        ReverseVowelsOfAString obj = new ReverseVowelsOfAString();
        System.out.println(obj.reverseVowels(s));
    }

    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        StringBuilder str = new StringBuilder(s);
        StringBuilder sb = new StringBuilder(s.toLowerCase());
        boolean leftBool = true;
        boolean rightBool = true;
        while (left <= right) {
            if (!(sb.charAt(left) == 'a' || sb.charAt(left) == 'e' || sb.charAt(left) == 'i' || sb.charAt(left) == 'o' || sb.charAt(left) == 'u')) {
                left++;
                leftBool = false;
            }
            if (!(sb.charAt(right) == 'a' || sb.charAt(right) == 'e' || sb.charAt(right) == 'i' || sb.charAt(right) == 'o' || sb.charAt(right) == 'u')) {
                right--;
                rightBool = false;
            }
            if (leftBool && rightBool) {
                char temp2 = str.charAt(left);
                str.setCharAt(left, str.charAt(right));
                str.setCharAt(right, temp2);
                left++;
                right--;
            }
            leftBool = true;
            rightBool = true;
        }
        return str.toString();
    }
}
