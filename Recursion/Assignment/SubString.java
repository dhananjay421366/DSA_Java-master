
class SubString {

    public static int SubString(String str, int si, int ei, int n) {

        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        int res = SubString(str, si + 1, ei, n - 1)
                + SubString(str, si, ei - 1, n - 1)
                - SubString(str, si + 1, ei - 1, n - 2);

        if (str.charAt(si) == str.charAt(ei)) {
            res++;
        }

        return res;

    }

    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();
        System.out.println(SubString(str, 0, n - 1, n));
    }
}
