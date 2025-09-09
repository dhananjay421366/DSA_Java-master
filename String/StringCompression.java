/* time complexity 
 * O(n)
 */

public class StringCompression {
    public static String StringCompression(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaaabbbb";
        String str1 = StringCompression(str);
        System.out.println(str1.getClass().getName());

    }
}
