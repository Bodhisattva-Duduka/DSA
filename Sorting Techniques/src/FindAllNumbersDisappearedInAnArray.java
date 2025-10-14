import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        //{1,2,3,4,2,3,7,8}
        System.out.println(findDisappearedNumbers(arr));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for (int num : nums) {
            arr.add(num);
        }
        int i = 0;
        while(i<arr.size()){
            int correct = arr.get(i)- 1;
            if(arr.get(i) != correct){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
            if (arr.get(i) == arr.get(correct)){
                i++;
            }
        }
        for (int j = 0; j < arr.size(); j++) {
            int correct = arr.get(i) - 1;
            if (arr.get(j) != correct){
                
            }
            
        }
        return arr;
    }

    static void swap(List<Integer> arr, int first, int second){
        int temp = arr.get(first);
        arr.set(first, arr.get(second));
        arr.set(second, temp);
    }
}
