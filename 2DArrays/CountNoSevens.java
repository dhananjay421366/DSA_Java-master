public class CountNoSevens {
    public static int CountNoSevens(int arr[][]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 7) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] array = {
                { 4, 7, 8 },
                { 8, 8, 7 }
        };
        int rows = array.length;
        int cols = array[0].length; // assumes all rows have same length

        System.out.println("Rows: " + rows);
        System.out.println("Cols: " + cols);
    }
}
