public class FindSingleNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,7,3,1,9,4,2,1,9,7};
        System.out.println(findNumber(arr));
    }
    static int findNumber(int[] arr){
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = result ^ arr[i];
        }
        return result;
    }
}
