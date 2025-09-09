import java.util.Arrays;
import java.util.Scanner;

public class StringBasic {
    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(' ');
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static boolean isAnagrams(String str1, String str2) {
        // 1. remove space and lowercase
        // 2. check length
        // 3. convert into arr
        // 4. sort arr
        // arrays.qual

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // check length
        if (str1.length() != str2.length()) {
            return false;
        }

        // convert arr
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // sort arr
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // check equality of arr
        if (Arrays.equals(arr1, arr2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        /* String are immutable */
        // char arr[] = { 'a', 'b', 'c' };
        // String str = "Dhananjay";
        // String str2 = new String("xyz");

        // // String are immutable

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name ");
        // String name1 = sc.next(); // return first word
        // System.out.println("Enter your name ");
        // String name2 = sc.nextLine(); // return hole string

        // System.out.println("Your name is : " + name1.length());
        // System.out.println("Your name is : " + name2.length());
        // System.out.println("Your name is : " + name2.length());

        // String firstName = "Dhananjay";
        // String LastName = "Nimbalkar ";
        // System.out.println(LastName + firstName); // string concate
        // System.out.println(LastName.concat(firstName));
        String str5 = "hi i am dhananjay";
        System.out.println(toUpperCase(str5));

    }
}
