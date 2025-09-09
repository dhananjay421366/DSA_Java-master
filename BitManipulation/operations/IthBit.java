
public class IthBit {

    public static int IthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        /*
         * 10 -> 1010 SECOND PLACE IS 0
         */
        int n = 10, i = 2;
        System.out.println(IthBit(n, i));

    }
}
