import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDulicates {
    public static String RemoveDuplicatChars(String str) {
        // add into set
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        // return res as string
        StringBuilder sb = new StringBuilder();
        for (char ch : set) {
            sb.append(ch);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "programming";
        System.out.println(RemoveDuplicatChars(str));

    }
}
