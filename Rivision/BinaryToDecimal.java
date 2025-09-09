
public class BinaryToDecimal {

    public static int BinaryToDecimal(int num) {
        int decNo = 0;
        int pow = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            decNo = decNo + (lastDigit * (int) Math.pow(2, pow));

            pow++;
            num /= 10;  // remove the last digit 
        }
        return decNo;
    }

    public static int DecimalToBinary(int num) {
        int decNo = 0;
        int pow = 0;
        while (num > 0) {
            int lastDigit = num % 2;
            decNo = decNo + (lastDigit * (int) Math.pow(10, pow));

            pow++;
            num /= 2;  // remove the last digit 
        }
        return decNo;
    }

    public static void main(String[] args) {
        int num = 4;
        System.out.println(DecimalToBinary(num));

    }
}
