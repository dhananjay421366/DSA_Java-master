public class StarPattern {
    public static void main(String args[]) {
        for (int i = 1; i <= 10; i++) {  // Outer loop (Rows)
            for (int j = 1; j <= i; j++) {  // Inner loop (Columns)
                System.out.print("*");  // Prints stars
            }
            System.out.println();  // Moves to the next line
        }
    }
}
