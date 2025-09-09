import java.util.*;

public class Input_In_java {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // give user through input a string

        System.out.println("Enter your name");
        // String name = sc.next(); // return first word for string
        String name = sc.nextLine(); // return a full line for string

        System.out.println(" Hi " + name + " ! ");

        // for integer value
        System.out.println("Enter your age!");
        int age = sc.nextInt(); // return a number for integer

        System.out.println(" Hi " + age + " ! ");
    }
}
