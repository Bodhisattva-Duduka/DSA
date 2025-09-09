
import java.util.Arrays;


public class SearchInStringWithArrays {

    public static void main(String[] args) {
        String name = "Bodhisattva";
        char target = 'x';
        char[] charArray = name.toCharArray();
        System.out.println(Arrays.toString(charArray));
        System.out.println(search(charArray, target));
    }

    public static boolean search(char[] arr, char target) {
        if (arr.length == 0) {
            return false;
        }
        for (int index = 0; index < arr.length; index++) {

            if (arr[index] == target) {
                return true;
            }
        }
        return false;
    }
}
