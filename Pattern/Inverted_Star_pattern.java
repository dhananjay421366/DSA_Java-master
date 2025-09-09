
public class Inverted_Star_pattern {
    public static void main(String as[]) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
