
/*
 * Time complexity O(n)
 */
public class MoveAllX {

    public static void MoveAllX(String str, int index, int count, StringBuilder st) {
        if (str.length() == index) {
            while (count > 0) {
                st.append('x');
                count--;
            }
            System.out.println(st.toString());
            return;
        }

        // get currChar 
        char currChar = str.charAt(index);
        if (currChar == 'x') {
            count++;
            MoveAllX(str, index + 1, count, st);
        } else {
            st.append(currChar);
            MoveAllX(str, index + 1, count, st);
        }

    }

    public static void main(String[] args) {
        String str = "axxxxdddd";

        MoveAllX(str, 0, 0, new StringBuilder());

    }
}
