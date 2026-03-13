import java.util.HashMap;

public class LongestSubstringwithKUniques {
    public static void main(String[] args){
        String s = "aabacbebebe";
        int k = 3;
        LongestSubstringwithKUniques obj = new LongestSubstringwithKUniques();
        System.out.println(obj.longestKSubstr(s, k));
    }
    public int longestKSubstr(String s, int k) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int currentLength = -1;
        int max = -1;
        while(right<s.length()){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            while(map.size()>k && left<right){
                // currentLength = right - left;
                if(map.get(s.charAt(left)) == 0){
                    map.remove(s.charAt(left));
                } else {
                    map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                    if(map.get(s.charAt(left)) == 0){
                        map.remove(s.charAt(left));
                    }
                }
                left++;
            }
            if(map.size() == k){
                currentLength = right - left + 1    ;
            }
            max = Math.max(currentLength, max);
            right++;
        }
        return max;
    }
}
