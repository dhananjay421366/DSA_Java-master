
import java.util.HashMap;
import java.util.Map;

public class CharFreq {

    public static Map<Character, Integer> CharFreq(String str) {
        Map<Character, Integer> freq = new HashMap<>();
        int n = str.length();
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                continue;
            }
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        return freq;
    }

    public static void main(String[] args) {
        String str = "Hello Dhananjay";
        System.out.println(CharFreq(str));

    }
}
