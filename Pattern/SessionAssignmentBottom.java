
public class SessionAssignmentBottom {
    public static void main(String args[]) {
        int n = 4;
        for (int i = 1; i < 4; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
