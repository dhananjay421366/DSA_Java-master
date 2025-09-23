
public class SumOfNatural {

    public static int SumOfNatural(int n) {
        if (n < 1) {
            return 0;
        }
        int sum = 0;
        sum += n + SumOfNatural(n - 1);
        return sum;

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(SumOfNatural(n));

    }
}
