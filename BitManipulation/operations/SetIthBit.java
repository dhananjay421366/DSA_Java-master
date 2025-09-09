
public class SetIthBit {

    public static int SetIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;

    }

    public static void main(String[] args) {
        /*
         * 10-> 1010 => 1110  SET 1 IN 2ND POSITION 
         */
        int n = 10, i = 2;
        System.out.println(SetIthBit(n, i));

    }
}
