public class CalculateMoneyInLeetcodeBank {
    public static void main(String[] args) {
        int n = 20;
        CalculateMoneyInLeetcodeBank obj = new CalculateMoneyInLeetcodeBank();
        System.out.println(obj.totalMoney(n));
    }
    public int totalMoney(int n) {
        int q = n/7;
        int r = n%7;
        int start = 1;
        int sum = 0;
        if(q<=0){
            return r*(r+1)/2;
        }
        while(q!=0){
                sum = sum + ((7*start) + 21);
            q--;
            start++;
        }
        if(r!=0){
                sum = sum + (int)((r/2.0)*((2*start) + (r-1)));
        }
        return sum;
    }
}
