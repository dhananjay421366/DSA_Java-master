public class Function_Overloading {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static float sum(float a, float b, float c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10f, 20f, 30f));
    }
}