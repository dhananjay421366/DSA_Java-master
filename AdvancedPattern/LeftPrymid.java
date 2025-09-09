public class LeftPrymid {
    public static void LeftPrymid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void RightPrymid(int n) {
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }

            // star
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        LeftPrymid(5);
        RightPrymid(5);
    }
}
