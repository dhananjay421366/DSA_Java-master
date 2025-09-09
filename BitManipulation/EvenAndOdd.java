
public class EvenAndOdd {

    public static void EvenAndOdd(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        EvenAndOdd(3);
        EvenAndOdd(11);
        EvenAndOdd(14);

    }
}
