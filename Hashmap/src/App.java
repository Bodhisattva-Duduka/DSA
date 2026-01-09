import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        // practice
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 5);
        map.put(2, 3);
        map.put(3,0);
        map.put(4,1);
        int value = map.getOrDefault(4, 0) + 1;
        map.putIfAbsent(5, 3);
        int mapSize = map.size();
        // for (int key : map.keySet()) {
        //     System.out.print(key);
        //     System.out.print(map.get(key));
        // }
        // for(HashMap.Entry<Integer, Integer> e: map.entrySet()){
        //     System.out.print(e.getKey() + " ");
        //     System.out.print(e.getValue());
        //     System.out.println();
        // }

        // frequency counter playground
        // int[] arr = {3,3,1,2,1,1,4};
        // App obj = new App();
        // obj.frequencyCounterPlayground(arr);

        // seen before detector
        int[] nums = {5,2,5,3,2,4};
        App obj = new App();
        System.out.println(Arrays.toString(obj.seenBeforeDetector(nums)));
    }
 
    void frequencyCounterPlayground(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int max = 0;
        int maxFrequencyElement = 0;
        for (HashMap.Entry<Integer, Integer> e : map.entrySet()){
            if (e.getValue()>=max){
                max = e.getValue();
                maxFrequencyElement = e.getKey();
            }
            System.out.println("Key " + e.getKey() +" " + "Value " + e.getValue());
        }
        System.out.println();
        System.out.println(maxFrequencyElement);
    }

    int[] seenBeforeDetector(int[] arr){
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int[] newArray = new int[map.size()];
        int i = 0;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            newArray[i] = e.getKey();
            i++;
        }
        i = 0;
        for(int key : map.keySet()){
            newArray[i] = key;
            i++;
        }
        return newArray;
    }
}
