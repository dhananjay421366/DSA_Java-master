/*
 * Time complexity :: O(log n)
 */
public class OptimizedPower {

    public static long OptimizedPower(long x, long n) {
        if (n == 0) {
            return 1;
        }
        long halfPower = OptimizedPower(x, n / 2);
        long FullPowerSq = halfPower * halfPower;

        // n is odd
        if (n % 2 != 0) {
            FullPowerSq = FullPowerSq * x;
        }

        return FullPowerSq;
    }

    public static void main(String[] args) {
        long x = 2;
        long n = 10;
        System.out.println(OptimizedPower(x, n));
    }
}
