public class AssignmentQue {
    // public static void Inverted_rotated_half_Prymid(int n) {
    // for (int i = n; n >= 1; i--) {
    // // space
    // for (int j = 1; j < i; j++) {
    // System.out.print(" ");
    // }
    // // star
    // for (int k = 1; k <= n; k++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    public static void Prymid(int n) {
        for (int i = 1; i <= n; i++) {
            // space
           for(int j = 1 ; j<i;j++){
            System.out.print(" ");
        
           }
           for (int j = 1; j <= n - i; j++) {
            System.out.print("*");
        }

            System.out.println();
        }

    }

    public static void NextPrymid(int n) {
        int curr_num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(curr_num + "\t\t");
                curr_num++;
            }
            System.out.println("");
        }
    }

    public static void Hollow_Rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // hollow rectangle
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();

        }
    }

    public static void main(String[] args) {
        // Inverted_rotated_half_Prymid(5);
        Prymid(5);
        NextPrymid(5);
        Hollow_Rhombus(5);
    }
}
