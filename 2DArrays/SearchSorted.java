public class SearchSorted {
    public static boolean Staircase_Search(int matrix[][], int key) {
        int row = 0, col = matrix.length-1;
        boolean found = false;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("found key at (" + row + "," + col + ")");
                found = true;
                return true;
            } else if (key < matrix[row][col]) {
                col--;

            } else {
                row++;
            }
        }
        System.out.println("Key does not exist");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        System.out.println(Staircase_Search(matrix, 16));
    }
}
