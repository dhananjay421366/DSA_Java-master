public class DecimalToBinary {
    public static void DecimalToBinary(int n) {
        int pow = 0;
        int binum = 0;

        while (n > 0) {
            int rem = n % 2;
            System.out.print(rem);
            System.out.println();
            binum = binum + (rem * (int) Math.pow(10, pow));

            pow++;
            n = n / 2; // Remove Last Digit
        }
        System.out.println(binum);
    }

    public static void main(String[] args) {
        DecimalToBinary(8);

    }
}
