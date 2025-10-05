public class AllSubstrings {
    public static void main(String[] args) {
        String str = "abc";
        int n = str.length();
        // start index
        for (int i = 0; i < n; i++) {
            // end index
            for (int j = i+1; j <= n; j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
}
