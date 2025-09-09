import java.util.Scanner;

public class ArraysCC {
    public static void main(String args[]) {
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                marks[i] = i;
            }
        }
        for (int i = 1; i <= marks.length && marks[i] != 0; i++) {
            System.out.println(marks[i]);
        }

    }
}
