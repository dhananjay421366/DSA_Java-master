// Q1 . Print the 1000 times hello world on the screen using while loop 

public class Loops {
    public static void main(String args[]) {
        int counter = 0;
        while (counter < 1000) {
            System.out.print("Hello world  dhananjay!" + " ");
            counter++;
        }
        System.out.println();
    }
}

// // while loop
// import java.util.*;

// public class Loops {
// public static void main(String args[]) {
// try {
// Scanner sc = new Scanner(System.in);

// System.out.println("Enter the length of Numbers");
// int n = sc.nextInt();
// int counter = 1;
// int sum = 0;

// if (n < 0) {
// System.out.println("Please enter a positive integer");
// sc.close();
// }
// while (counter <= n) {
// sum += counter;
// System.out.print(counter + " ");
// counter++;
// }
// System.out.println("The sum of numbers is : " + sum);

// sc.close();
// } catch (Exception e) {
// System.out.println("An Error is :" + e.getMessage());
// // TODO: handle exception
// }
// }
// }
