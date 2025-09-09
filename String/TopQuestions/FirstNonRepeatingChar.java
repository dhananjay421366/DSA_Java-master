
public class FirstNonRepeatingChar {

    public static int FirstNonRepeatingChar(String str) {
        int[] freq = new int[256];

        // find freq 
        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String str = "dhhdh";
        System.out.println(FirstNonRepeatingChar(str));
    }
}
