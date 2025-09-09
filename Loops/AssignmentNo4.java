import java.util.Scanner;

public class AssignmentNo4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;

        for (int i = 1; i <= n; i++) { //
            ans = ans * i;

        }
        System.out.println("Ans is : " + ans);
    }

}
