public class PrintAllPrimes {
    public static void main(String[] args) {
        int n = 80;
        printPrimes(n);
    }
    static void printPrimes(int n){
        if (n<=0 || n == 1){
            System.out.println("No primes");
        }
        boolean bool = true;
        for (int i = 2; i<n; i++){
            for (int j = 2; j < i; j++) {
                if ((i%j == 0) && bool){
                    bool = false;
                    break;
                }
            }
            if(bool){
                System.out.println(i);
            }
            bool = true;
        }
    }
}
