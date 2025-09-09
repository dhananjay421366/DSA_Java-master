
public class UpdateIthBit {

    public static int SetIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;

    }

    public static int ClearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;

    }

    public static int UpdateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return ClearIthBit(n, i);
        }
        return SetIthBit(n, i);
    }

    public static void main(String[] args) {

        /*
         * 10 -> 1010 => 1000 clear the bit 
         */
        int n = 10, i = 1, newBit = 1;
        System.out.println(UpdateIthBit(n, i, newBit));

    }
}
