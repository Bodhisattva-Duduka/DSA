public class validAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagarm";
        validAnagram obj = new validAnagram();
        System.out.println(obj.checkAnagram(s, t));
    }
    public boolean checkAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int[] freq = new int[26];
        for(int i = 0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i<t.length(); i++){
            freq[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i<t.length(); i++){
            if(freq[t.charAt(i) - 'a'] != 0){
                return false;
            }
        }
        return true;
    }
}
