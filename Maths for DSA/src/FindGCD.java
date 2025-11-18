
public class FindGCD {

    public static void main(String[] args) {
        int n = 40, m = 60;
        FindGCD obj = new FindGCD();
        System.out.println(obj.gcd(n, m));
    }

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}
