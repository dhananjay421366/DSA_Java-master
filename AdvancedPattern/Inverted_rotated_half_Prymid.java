public class Inverted_rotated_half_Prymid {

    public static void Inverted_rotated_half_Prymid(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Inverted_rotated_half_Prymid_with_no(int rows) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Inverted_rotated_half_Prymid(4, 4);
        Inverted_rotated_half_Prymid_with_no(5);

    }
}