
import java.util.Scanner;

public class Do_While_loop {
    public static void main(String args[]) {
        int counter = 1;
        // do {
        // System.out.println("Hello world!");
        // counter++;
        // } while (counter <= 10);

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter the number");
            int no = sc.nextInt();
            if (no % 10 == 0) {
                continue;
            } else {
                System.out.println("The number is " + no);
            }
        } while (true);

    }
}
