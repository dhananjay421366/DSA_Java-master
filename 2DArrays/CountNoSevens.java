
public class CountNoSevens {

    public static int CountNoSevens(int arr[][]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {  // row 
            for (int j = 0; j < arr[i].length; j++) { // col
                if (arr[i][j] == 7) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] array = {
            {4, 7, 8},
            {8, 8, 7}
        };

        System.out.println(CountNoSevens(array));
        int rows = array.length;
        int cols = array[0].length; // assumes all rows have same length

        System.out.println("Rows: " + rows);
        System.out.println("Cols: " + cols);
    }
}
