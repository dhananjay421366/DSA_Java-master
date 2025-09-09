public class BinomialCoefficient {
    public static int factorial(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }
        return ans;
    }

    public static int bionomial(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_r_n = factorial(n - r);
        int binCoeff = fact_n / (fact_r * fact_r_n);

        return binCoeff;
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        int res = bionomial(n, r);
        System.out.println(res);

    }
}
