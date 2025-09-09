public class AssignmentQue {
    public static int SumInteger(int n) {
        int sumDigit = 0;

        while (n > 0) {
            int lastDigit = n % 10; // last digit of no
            sumDigit += lastDigit;
            n =  n/10; // Remove Last Digit

        }
        return sumDigit;
    }

    public static void main(String[] args) {
        System.out.println(SumInteger(12));

    }
}
