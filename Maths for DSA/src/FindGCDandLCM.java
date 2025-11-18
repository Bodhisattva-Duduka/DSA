
public class FindGCDandLCM {

    public static void main(String[] args) {
        int n = 40, m = 60;
        FindGCDandLCM obj = new FindGCDandLCM();
        System.out.println("GCD: " + obj.gcd(n, m));
        System.out.println("LCM: " + obj.lcm(n, m));
    }

    int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
    int lcm(int a, int b){
        return a * b / gcd(a,b);
    }
}
