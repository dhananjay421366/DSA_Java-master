public class String_Palindrome {
    public static boolean isPalindrome(String str) {
        int n = str.length() - 1;
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(n--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String str = "noon";
        System.out.println(isPalindrome(str));
    }
}
