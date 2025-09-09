public class LargestString {
    public static String[] LagrString(String str[]) {
        String largest = str[0];
        String min = str[0];

        for (int i = 1; i < str.length; i++) {
            if (str[i].compareTo(largest) > 0) {
                largest = str[i];
            }
            if (str[i].compareTo(min) < 0) {
                min = str[i];
            }
        }
        return new String[] { largest, min };
    }

    public static void main(String[] args) {
        String Fruits[] = { "apple", "mango", "banana" };
        // System.out.println(LagrString(Fruits));
        String res[] = LagrString(Fruits);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }
}
