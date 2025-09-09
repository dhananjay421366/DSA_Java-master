import java.util.*;

public class Average {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int no1 = sc.nextInt();

        System.out.println("Enter the second number");
        int no2 = sc.nextInt();

        System.out.println("Enter the third number");
        int no3 = sc.nextInt();

        int totalNo = 100;

        // now find the average
        int average = no1 + no2 + no3 / totalNo;

        System.out.println(" The average is the " + average);
    }
}