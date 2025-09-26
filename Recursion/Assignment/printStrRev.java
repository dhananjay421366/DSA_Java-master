
public class printStrRev {

    public static void printStrRev(String str, int index) {
        if (index == 0) {
            System.out.println(str.charAt(index));
            return;
        }

        System.out.print(str.charAt(index));
        printStrRev(str, index - 1);
    }

    public static void main(String[] args) {
        String str = "Dhananjay";
        int index = str.length() - 1;
        printStrRev(str, index);

    }
}
