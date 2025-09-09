import java.util.Scanner;

public class Week_Number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day in week ");
        int day_no = sc.nextInt();

        if (day_no < 0 || day_no > 7) {
            System.out.println("You are entered incorrect day number in week");
            return;
        }

        switch (day_no) {
            case 1:
                System.out.println("The day is Sunday");
                break;
            case 2:
                System.out.println("The day is monday");
                break;
            case 3:
                System.out.println("The day is Tuesday");
                break;
            case 4:
                System.out.println("The day is Wednesday");
                break;
            case 5:
                System.out.println("The day is Thursday");
                break;
            case 6:
                System.out.println("The day is Friday");
                break;
            case 7:
                System.out.println("The day is Saturday");
                break;
            default:
                System.out.println("Day are not exist");
        }
    }
}
