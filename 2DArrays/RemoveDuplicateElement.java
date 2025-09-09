import java.util.*;

public class RemoveDuplicateElement {
    public static int[] removeDuplicateElements(int[][] matrix) {
        Set<Integer> set = new LinkedHashSet<>(); // keeps insertion order
        
        for (int[] row : matrix) {
            for (int val : row) {
                set.add(val); // duplicates automatically ignored
            }
        }
        
        // Convert set to int[]
        int[] unique = new int[set.size()];
        int index = 0;
        for (int val : set) {
            unique[index++] = val;
        }
        return unique;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        int[][] matrix = new int[n][m];
        Scanner sc = new Scanner(System.in);

        // Input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        int[] result = removeDuplicateElements(matrix);

        System.out.println("Unique elements:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
