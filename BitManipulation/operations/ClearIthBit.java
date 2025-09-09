
public class ClearIthBit {

    public static int ClearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static void main(String[] args) {
        /*
         * 10 -> 1010  => 1000
         */
        int n = 10, i = 1;
        System.out.println(ClearIthBit(n, i));

    }
}
