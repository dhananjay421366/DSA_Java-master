public class lengthOfString {
    public static int lengthOfString(String str){
        if(str.equals("")){
            return 0;
        }

        System.out.println(str.substring(1));

        return  1+lengthOfString(str.substring(1));


    }
    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println(lengthOfString(str));
    }
}
