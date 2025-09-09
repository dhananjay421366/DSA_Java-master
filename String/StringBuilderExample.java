/* time complexity 
 * for simple String :: O(n^2)
 * for StringBuilder :: O(26)
 */
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("dhanu");
        for (char ch = 'A'; ch < 'Z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb.length());
    }
}
