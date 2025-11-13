public class SetIthBit {
    public static void main(String[] args) {
        System.out.println(setBit(24, 2));
    }
    static int setBit(int n, int i){
        int shift = 1 << (i-1);
        int bit = n & shift;
        int unshift = bit >> (i-1);
        if (unshift == 0){
            unshift = 1;
            unshift = unshift << (i-1);
            n = n | unshift;
        }
        return n;
    }
}
