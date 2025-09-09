public class ReverseAndUppercaseString {
    public static String ReverseAndUpperCaseString(String str) {
        StringBuilder sb = new StringBuilder("");
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
            reversed += str.charAt(i);
        }
        System.out.println(reversed.toUpperCase());
        return sb.toString().toUpperCase();
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(ReverseAndUpperCaseString(str));
    }
}
