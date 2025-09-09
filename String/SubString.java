public class SubString {
    public static String subString(String str, int si, int ei) {
        String subStr = "";
        for (int i = si; i < ei; i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        int si = 0, ei = 5;
        System.out.println(subString(str, si, ei));
        System.out.println(str.substring(0, 5));
    }
}
