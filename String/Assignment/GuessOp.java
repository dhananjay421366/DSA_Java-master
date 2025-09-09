public class GuessOp {
    public static void main(String[] args) {
        String str = "Dhananjay";
        String str1 = "ApnaCollage";
        String str2 = "Dhananjay";
        System.out.println(str.equals(str1) + " " + str.equals(str2));

        /* replace */
        String st4 = "ApnaCollage".replace("l", "");
        String str5 = "ApnaCollage".replaceAll("l", "");
        System.out.println(st4);
        System.out.println(str5);
    }
}
