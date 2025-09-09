
import java.util.Scanner;

public class Print_N_No {
    // print n numbers

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double Range = sc.nextInt();
        double num = 1;

        while (num <= Range) {
            System.out.println(num);
            num++;
        }

    }
}
