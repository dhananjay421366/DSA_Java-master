public class StringCompression {
    public static String StringCompression(String str) {
        int count = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length() - 1; i++) {
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                i++;
                count++;
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
        System.out.println(StringCompression(str));
    }
}
