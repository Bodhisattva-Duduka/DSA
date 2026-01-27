
public class RansomNote {

    public static void main(String[] args) {
        String ransomNote = "aaaaa";
        String magazine = "aabbaa";
        RansomNote obj = new RansomNote();
        System.out.println(obj.canConstruct(ransomNote, magazine));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < ransomNote.length(); i++) {
            freq1[ransomNote.charAt(i) - 'a']++;
        }

        for (int i = 0; i < magazine.length(); i++) {
            freq2[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < freq1.length; i++) {
            if (!(freq1[i] <= freq2[i])) {
                return false;
            }
        }

        return true;
    }
}
