
import java.util.Scanner;

public class AssignmentQue2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        System.out.println("Enter the number  of elements");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the elements");
            int Element = sc.nextInt();
            if (Element % 2 == 0) {
                even += Element;
            } else {
                odd += Element;
            }

        }
        System.out.println("Even No Sum is : " + even);
        System.out.println("odd No Sum is : " + odd);

    }

}
