
public class Tiling {

    public static int TilingProblem(int n) {  // 2 X n (floor size)

        // base case 
        if (n == 0 || n == 1) {
            return 1;
        }
        // kaam

        // veretical choise
        int vereticalTiles = TilingProblem(n - 1); // 3
        // horizontal choise 
        int horizontalTiles = TilingProblem(n - 2);
        int totalWays = vereticalTiles + horizontalTiles;
        return totalWays;
        // return TilingProblem(n - 1) + TilingProblem(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(TilingProblem(4));

    }
}
