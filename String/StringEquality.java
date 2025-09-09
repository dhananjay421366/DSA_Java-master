public class StringEquality {

    public static void StringEquality(String str1, String str2) {

        // == and str.equals()
        if (str1 == str2) {
            System.out.println("String are equals");
        } else {
            System.out.println("String are not equals ");
        }

    }

    public static void main(String[] args) {
        String str1 = "Tony";
        String str2 = "Tony";
        String str3 = new String("Tony");
        StringEquality(str1, str2);

    }
}
