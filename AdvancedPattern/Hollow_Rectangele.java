
public class Hollow_Rectangele {
    public static void hollow_Rectangle(int toRows, int toCols) {
        for (int i = 1; i <= toRows; i++) { // row
            for (int j = 1; j <= toCols; j++) { // col
                if (i == 1 || j == 1 || i == toRows || j == toCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_Rectangle(4, 8);

    }
}
