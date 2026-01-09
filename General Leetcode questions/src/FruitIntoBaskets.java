import java.util.*;
public class FruitIntoBaskets {
    public static void main(String[] args) {
        int[] fruits = {3,3,3,1,2,1,1,2,3,3,4};
        int[] fruits2 = {4,4,4,3,3,1};
        FruitIntoBaskets obj = new FruitIntoBaskets();
        System.out.println(obj.totalFruit(fruits));
    }
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int left = 0;
        int right = 0;
        int currentWindow = 0;
        int maxWindow = 0;
        while(right<fruits.length){
            currentWindow++;
            freq.put(fruits[right], freq.getOrDefault(fruits[right], 0) + 1);
            while(freq.size()>2){
                currentWindow--;
                if(freq.get(fruits[left]) == 0){
                    freq.remove(fruits[left]);
                }
                else{
                    freq.put(fruits[left], freq.get(fruits[left]) - 1);
                    if(freq.get(fruits[left]) == 0){
                        freq.remove(fruits[left]);
                    }
                }
                left++;
            }
            maxWindow = Math.max(currentWindow, maxWindow);
            right++;
        }
        return maxWindow;
    }
}
