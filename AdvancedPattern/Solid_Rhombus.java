public class Solid_Rhombus {
    public static void Solid_Rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Solid_Rhombus(7);
    }
}
