
class Solution {

    /*
    res = (a ^ b ^ c ^ d) ^ (a ^ b ^ c ^ d ^ e)
    = [a^a ^ b^b ^ c^c ^ d^d] ^ e
    = 0 ^ 0 ^ 0 ^ 0 ^ e
    = e

     */
    public static char findTheDifference(String s, String t) {
        char res = 0;
        for (char c : s.toCharArray()) {
            res ^= c;
        }
        for (char c : t.toCharArray()) {
            res ^= c;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        findTheDifference(s, t);

    }
}
