
import java.util.Scanner;

public class SumOfFirstNaturalNo {
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int i = 1;
        int sum = 0;

        while (i <= num) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}