public class LongestWord {
    public static String LongestWord(String str) {
        // str = str.replaceAll("\\s", "");
        System.out.println(str);
        String[] res = str.split(" ");
        String max = "";
        for (int i = 0; i < res.length; i++) {
            if (res[i].length() > max.length()) {
                max = res[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String str = "hi i am dhananjay";
        System.out.println(LongestWord(str));

    }
}
