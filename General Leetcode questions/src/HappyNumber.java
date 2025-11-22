
import java.util.ArrayList;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 32;
        HappyNumber obj = new HappyNumber();
        System.out.println(obj.isHappy(n));
    }
    public boolean isHappy(int n) {
        int rem = 0;
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(n>0){
            rem = n%10;
            n = n/10;
            sum = sum + (int) Math.pow(rem, 2);
            if (!(n>0)){
                n = sum;
                if (sum == 1){
                    return true;
                }
                if (list.contains(n)){
                    return false;
                }
                list.add(sum);
                sum = 0;
            }
        }
        return false;
    }
}
