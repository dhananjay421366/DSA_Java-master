
public class ClearIthBits {

    public static int ClearIthBits(int n, int i) {
        int bitMask = ~(0) << i;
        return n & bitMask;
    }

    public static void main(String[] args) {
        /*
         * 15 -> 1111 => 1100
         */
        int n = 15, i = 2;
        System.out.println(ClearIthBits(n, i));
    }
}
