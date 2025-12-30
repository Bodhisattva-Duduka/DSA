import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,1};
        SortColors obj = new SortColors();
        obj.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public void sortColors(int[] nums) {
        int pointer = 0;
        int zeroes = 0;
        int ones = 0;
        int twos = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[pointer] == 0){
                zeroes++;
            }
            else if(nums[pointer] == 1){
                ones++;
            }
            else{
                twos++;
            }
            pointer++;
        }
        int i = 0;
        while(zeroes>0){
            nums[i] = 0;
            i++;
            zeroes--;
        }
        while(ones>0){
            nums[i] = 1;
            i++;
            ones--;
        }
        while(twos>0){
            nums[i] = 2;
            i++;
            twos--;
        }
    }
}
