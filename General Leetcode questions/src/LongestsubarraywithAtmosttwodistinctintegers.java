import java.util.HashMap;

public class LongestsubarraywithAtmosttwodistinctintegers {
    public static void main(String[] args) {
        int[] arr = {10,6, 9, 4, 8, 8};
        LongestsubarraywithAtmosttwodistinctintegers obj = new LongestsubarraywithAtmosttwodistinctintegers();
        System.out.println(obj.totalElements(arr));
    }
    public int totalElements(int[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int currentLength = 0;
        int max = 0;
        int k = 2;
        while(right<arr.length){
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            while(map.size()>k){
                if(map.get(arr[left]) == 0){
                    map.remove(arr[left]);
                } else {
                    map.put(arr[left], map.get(arr[left]) - 1);
                    if(map.get(arr[left]) == 0){
                        map.remove(arr[left]);
                    }
                }
                left++;
            }
            if(map.size() <= k) {
                currentLength = right - left + 1;
            }
            max = Math.max(currentLength, max);
            right++;
        }
        return max;
    }
}
