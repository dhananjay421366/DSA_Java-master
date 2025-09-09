
public class IsPowerOfTwo {

    public static boolean IsPowerOfTwo(int n) {

        /*
         * 15 -> 1111
         * 14 ->1110
         */
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(IsPowerOfTwo(14));
    }
}
