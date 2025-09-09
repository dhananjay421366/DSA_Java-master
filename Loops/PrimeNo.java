
import java.util.Scanner;

public class PrimeNo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int no = sc.nextInt();
        boolean isPrime = true;
        if (no == 2) {
            System.out.println("Number is prime : " + no);
        } else {
            for (int i = 2; i <= Math.sqrt(no); i++) {
                if (no % i == 0) {
                    isPrime = false;

                }
            }
            if (isPrime == true) {
                System.out.println("Number  is prime : " + no);
            } else {
                System.out.println("Number is not prime :" + no);
            }
        }
    }

}
