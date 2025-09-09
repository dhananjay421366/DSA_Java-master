public class IsEven {
    public static boolean isEven(int n) {
        boolean isEven = true;
        if (n < 1) {
            return false;
        }
        if (n % 2 == 0) {
            isEven = true;
        }else{
            isEven = false;
        }
        return isEven;
    }
    public static void main(String[] args) {
      System.out.println(  isEven(14));
    }
}
