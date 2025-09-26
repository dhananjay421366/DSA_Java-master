
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromString {

    public static String RemoveDuplicateFromString(String str) {

        Set<Character> setA = new HashSet<>();
        StringBuilder sb = new StringBuilder("");
        for (char ch : str.toCharArray()) {

            if (!setA.contains(ch)) {
                setA.add(ch);
                sb.append(ch);
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {

        String str = "apnacollage";
        System.out.println(RemoveDuplicateFromString(str));
    }
}
