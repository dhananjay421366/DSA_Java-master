
public class CountSetBits {

    public static int CountSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {  // check our LSB
                count++;
            }
            // rigth shift 
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(CountSetBits(n));
    }
}
