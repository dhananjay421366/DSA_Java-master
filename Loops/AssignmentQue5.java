import java.util.Scanner;

public class AssignmentQue5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
 
        for (int i = 1; i <= 10; i++) {
            if (no == 0) {
                return;
            }
            System.out.println("The table of number is : " + no * i);
        }
    }
}
