import java.util.Arrays;

public class StringAnagrams {
    public static void isAnagrams(String str1, String str2) {

        // remove the space and convert into lowercae
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // check length are same orr not
        if (str1.length() != str2.length()) {
            System.out.println("string are not anagrams");
        }

        // convert into char arr
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // sort the array

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // check anagrams
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("string  anagrams");
        } else {
            System.out.println("string are not anagrams");
        }
    }

    public static void main(String[] args) {
        String str1 = "dhara";
        String str2 = "radh";
        isAnagrams(str1, str2);

    }
}
