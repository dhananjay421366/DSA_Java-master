
public class RemoveDuplicates {

    public static boolean arr[] = new boolean[26];

    public static void RemoveDuplicates(String str, int index, StringBuilder sb) {

        if (str.length() == index) {
            System.out.println(sb);
            return;
        }
        char currChar = str.charAt(index);
        // already exist
        if (arr[currChar - 'a'] == true) {
            RemoveDuplicates(str, index + 1, sb);
        } else {

            // add char 
            sb.append(currChar);
            arr[currChar - 'a'] = true;
            RemoveDuplicates(str, index + 1, sb);
        }

    }

    public static void main(String[] args) {
        RemoveDuplicates("dhananjay", 0, new StringBuilder());
    }
}
