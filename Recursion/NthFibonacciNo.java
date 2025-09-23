
public class NthFibonacciNo {

    public static int NthFibonaccieNo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fibn_1 = NthFibonaccieNo(n - 1);
        int fibn_2 = NthFibonaccieNo(n - 2);
        int fib_n = 0;

        return fib_n = fibn_1 + fibn_2;

    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(NthFibonaccieNo(10));
    }
}
