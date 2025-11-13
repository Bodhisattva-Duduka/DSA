public class FindIthBit {
    public static void main(String[] args) {
        System.out.println(findBit(10, 4));
    }
    static int findBit(int n, int i){
        int shifted = 1 << (i-1);
        int bit = n & shifted;
        return bit >> (i-1);
    }
}
