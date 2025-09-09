import java.util.Scanner;

public class IncomeTax {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int income = sc.nextInt();
        int tax;
        if (income < 50000) {
            tax = 0;
            System.out.println("Your tax is :" + tax);        
        } else if (income < 1000000) {
            tax = (int) (income * 0.2);
            System.out.println("Your tax is :" + tax);
        } else {
            tax = (int) (income * 0.3);
            System.out.println("Your tax is :" + tax);

        }
    }
}
