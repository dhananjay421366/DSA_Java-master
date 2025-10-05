
public class AllSubstringsRecursive {

    // Recursive function to print substrings
    public static void printSubstrings(String str, int si, int ei) {
        int n = str.length();

        // Base case: start index reached end of string
        if (si == n) {
            return;
        }

        // If end index not reached, print substring and recurse
        if (ei <= n) {
            System.out.println(str.substring(si, ei));
            printSubstrings(str, si, ei + 1);
        } else {
            // Move to next start index
            printSubstrings(str, si + 1, si + 2);
        }
    }

    public static void main(String[] args) {
        String str = "aaacb";
        System.out.println("All substrings of \"" + str + "\":");
        printSubstrings(str, 0, 1);
    }
}
