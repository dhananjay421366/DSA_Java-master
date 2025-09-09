
public class IsPalindrome {

    public static boolean IsPalindrome(String code) {
        if (code.length() <= 1) {
            return true;
        }

        // remove all numbers
        code = code.replaceAll("\\d", "");

        // Reverse the string
        StringBuilder sb = new StringBuilder(code);
        String reversed = sb.reverse().toString();

        // Compare original with reversed
        return code.equals(reversed);
    }

    public static void main(String[] args) {
        String code = "abc123cba";
        System.out.println(IsPalindrome(code));
    }
}
