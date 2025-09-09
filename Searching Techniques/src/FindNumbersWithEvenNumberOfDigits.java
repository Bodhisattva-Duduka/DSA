
public class FindNumbersWithEvenNumberOfDigits {

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        FindNumbersWithEvenNumberOfDigits obj = new FindNumbersWithEvenNumberOfDigits();
        System.out.println(obj.findNumbers(nums));
    }

    public int findNumbers(int[] nums) {
        int count = 0;
        String str;
        for (int index = 0; index < nums.length; index++) {
            str = String.valueOf(nums[index]);
            if (str.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
