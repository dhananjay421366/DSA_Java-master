
public class StaticFunctions {

// Can be called without creating object.
// Can access static variables directly.
// Cannot access non-static variables directly.
    public static void main(String[] args) {
        System.out.println(Squares.name);
        System.out.println(Squares.square(5)); // No object needed
    }
}

class Squares {

    static String name = "Dhananjay";

    static int square(int x) {
        return x * x;
    }

}
