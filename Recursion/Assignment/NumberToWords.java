
public class NumberToWords {

    static String[] words = {
        "zero", "one", "two", "three", "four",
        "five", "six", "seven", "eight", "nine"

    };

    public static void printNumberInWords(int n) {
        // base case
        if (n == 0) {
            return;
        }

        // process previous digits first
        int lastDigit = n % 10;
        printNumberInWords(n / 10);

        // print this digit after recursion
        System.out.print(words[lastDigit] + " ");

    }

    public static void main(String[] args) {
        int n = 33;
        printNumberInWords(n);

    }
}
