
public class ClearBitsInRange {

    public static int ClearBitsInRange(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;

    }

    public static void main(String[] args) {
        int n = 10, i = 2, j = 4;
        System.out.println(ClearBitsInRange(n, i, j));
    }
}
