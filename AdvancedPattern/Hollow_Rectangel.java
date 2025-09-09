
public class Hollow_Rectangel {
    public static void Hollow_Rectangel(int row, int col) {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 1 && j == 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Hollow_Rectangel(3,3);
    }
}
