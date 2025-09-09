
public class FastExponentail {

    public static int FastExponentail(int a, int n) {
        int ans = 1;
        // return (int)Math.pow(a, n);

        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(FastExponentail(3, 5));
    }

}
