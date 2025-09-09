public class BinaryToDecimal {
    public static void BinaryToDecimal(int n) {
        int pow = 0;
        int decNum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

            pow++;
            n = n / 10; // Remove Last Digit
        }
        System.out.println("binary to decimal :" + decNum);
    }

    public static void main(String[] args) {
        BinaryToDecimal(1000);
    }
}
