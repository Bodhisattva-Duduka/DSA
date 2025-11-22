public class CountPrimes {
    public static void main(String[] args){
        int n = 10;
        CountPrimes obj = new CountPrimes();
        System.out.println(obj.countPrimes(n));
    }
    public int countPrimes(int n) {
        int count = 0;
        boolean bool = true;
        if(n<=1){
            return 0;
        }
        else {
            for (int i = 2; i<n; i++){
                for (int j = 2; j<i; j++){
                    if (i%j == 0){
                        bool = false;
                        break;
                    }
                }
                if (bool){
                    count++;
                }
                bool = true;
            }
        }
        return count;      
    }
}
