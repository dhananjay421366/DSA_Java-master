import java.util.Scanner;

public class Check_Number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int no = sc.nextInt();

        if (no < 0) {
            System.out.println("The number is Negative");

        } else {
            System.out.println("THe number is Positive");
        }

    }

}
