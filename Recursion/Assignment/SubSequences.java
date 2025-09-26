
public class SubSequences {

    public static void SubSequences(String str, int index, String newString) {

        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);

        // to be
        SubSequences(str, index + 1, newString + currChar);

        // or not to be
        SubSequences(str, index + 1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        SubSequences(str, 0, "");

    }
}
