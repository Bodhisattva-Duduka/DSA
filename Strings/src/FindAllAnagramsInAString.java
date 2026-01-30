import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllAnagramsInAString {
    public static void main(String[] args) {
        String s = "aaaaaaaaaa";
        String p = "aaaaaaaaaaaaa";
        FindAllAnagramsInAString obj = new FindAllAnagramsInAString();
        System.out.println(obj.findAnagrams(s, p));
    }
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> temp = new HashMap<>();
        if(p.length() >s.length()){
            return list;
        }
        char[] strArray = s.toCharArray();
        for(int i = 0; i<p.length(); i++){
            map.put(p.charAt(i), map.getOrDefault(p.charAt(i), 0) + 1);
        }
        int k = p.length();
        for(int i = 0; i<k; i++){
            temp.put(strArray[i], temp.getOrDefault(strArray[i], 0) + 1);
        }
        if(map.equals(temp)){
            list.add(0);
        }
        for(int i = k; i<strArray.length; i++){
            temp.put(strArray[i], temp.getOrDefault(strArray[i], 0) + 1);
            if (temp.get(strArray[i - k]) == 1){
                temp.remove(strArray[i - k]);
            } else {
                temp.put(strArray[i - k], temp.get(strArray[i - k]) - 1);
            }
            if(map.equals(temp)){
                list.add(i - k + 1);
            }
        }
        return list;
    }
}
