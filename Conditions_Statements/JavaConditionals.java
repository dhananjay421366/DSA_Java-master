import java.util.*;

public class JavaConditionals {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // conditional Statements
        // 1. if
        // 2. if else
        // 3. if else if
        // 4. nested if else
        // 5. switch
        // 6. ternary

        // int a = 10;

        // if (a < 10) {
        // System.out.println("Hello Dhananjay");
        // }
        // if (a <= 10) {
        // System.out.println("Hello Dhananjay");
        // } else {
        // System.out.println("Done Dhanu");
        // }

        // print the largest number

        int a = 10, b = 29;

        if (a < b) {
            System.out.println("The b is largest number");
        } else {
            System.out.println("The a is largets number");
        }

        // print the even number
        int no = sc.nextInt();
        if (no % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }
}