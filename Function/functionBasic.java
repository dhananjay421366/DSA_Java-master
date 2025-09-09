public class functionBasic {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int product(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        int a = 10, b = 10;
        System.out.println(sum(a, b));
        int mult = product(a, b);
        System.out.println(mult);
    }

}
