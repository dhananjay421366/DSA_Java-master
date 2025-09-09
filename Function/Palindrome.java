public class Palindrome {
    public static void IsPalindrome(int n) {
        int reverseNo = 0;
        int temp = n;
        while (temp != 0) {
            int lastDigit = temp % 10;
            reverseNo = reverseNo * 10 + lastDigit;
            temp = temp / 10; // Remove Last Digit

        }
        if (n == reverseNo) {
            System.out.println("Num is palindrome");
        } else {
            System.out.println("Num is not palindrome");

        }
    }

    public static void main(String[] args) {
        IsPalindrome(1211);
    }
}
