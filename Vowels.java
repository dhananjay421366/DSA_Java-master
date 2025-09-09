import java.util.HashMap;
import java.util.Map;
public class Vowels {
    public static void VowelsCount(String str) {
        if (str.length() == 0) {
            return;
        }

        String vowels = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels += ch;
            }
        }

        // now find the freq of vowels
        // Map<String, Integer> freq = new HashMap<>();
        // for (int i = 0; i < vowels.length(); i++) {
        // Character ch = vowels.charAt(i);
        // freq.put(ch.toString(), freq.getOrDefault(ch.toString(), 0) + 1);
        // }

        // System.out.println(freq);

        /* or */
        int freq[] = new int[26];
        for (int i = 0; i < vowels.length(); i++) {
            char ch = vowels.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] >= 1) {
                System.out.println((char) (i + 'a') + " -> " + freq[i]);
            }
        }

    }

    public static void main(String[] args) {
        String str = "helloo";
        VowelsCount(str);
    }
}
