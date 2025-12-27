
public class App {

    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        System.out.println(findNumberWithEvenNoOfDigits(arr));
    }

    // leetcode 1295

    public static int findNumberWithEvenNoOfDigits(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int noOfDigits = (int) Math.log(arr[i]) + 1;
            if (noOfDigits % 2 == 0) {
                count++;
            }
        }
        return count;
    }

}
