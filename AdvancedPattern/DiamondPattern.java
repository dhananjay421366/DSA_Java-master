import java.util.Arrays;

public class DiamondPattern {
    public static void DiamondPattern(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // star
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
        // 2nd half
        for (int i = n; i >= 1; i--) {
            // space
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // star
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

  
    public static void main(String[] args) {
        DiamondPattern(5);
      

    }
}
