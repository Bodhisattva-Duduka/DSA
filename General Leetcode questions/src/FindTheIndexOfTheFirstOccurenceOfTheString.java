
public class FindTheIndexOfTheFirstOccurenceOfTheString {

    public static void main(String[] args) {
        String haystack = "leeetcode";
        String needle = "eet";
        FindTheIndexOfTheFirstOccurenceOfTheString obj = new FindTheIndexOfTheFirstOccurenceOfTheString();
        System.out.println(obj.strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {
        int slow = 0;
        int fast = 0;
        int i = 0;
        boolean found = false;
        while (fast <= haystack.length() - 1 && !found) {
            if (haystack.charAt(fast) == needle.charAt(i)) {
                i++;
                fast++;
            } else {
                i = 0;
                slow = fast;
                fast++;
            }
            if (i == needle.length()) {
                slow = fast;
                found = true;
                return slow;
            }
        }
        return -1;
    }
}
