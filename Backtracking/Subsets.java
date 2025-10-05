
public class Subsets {

    public static void Subsets(String str, StringBuilder ans, int i) {
        // base case 
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.print("Null" + " ");
            } else {
                System.out.print(ans + "  ");
            }
            return;
        }

        // yes choice 
        Subsets(str, new StringBuilder(ans).append(str.charAt(i)), i + 1);

        // no choice
        Subsets(str, ans, i + 1);

    }

    public static void main(String[] args) {
        String str = "abc";
        // Subsets(str, "", 0);
        Subsets(str, new StringBuilder(), 0);

    }
}
