

/* 
    * Time complexity ::: O(log n )
 */
public class Power {

    public static int Power(int a, int n) {
        if (n == 0) {
            return 1;
        }

        // calculate half power  // of Even Case
        int halfPower = Power(a, n / 2);

        // for odd case
        if (n % 2 != 0) {
            return a * halfPower * halfPower;
        } else {
            return halfPower * halfPower;
        }
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 4;
        System.out.print(Power(a, n));

    }
}
