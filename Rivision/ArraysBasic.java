public class ArraysBasic {
    public static int SecondMaxNo(int arr[]) {
        int max = arr[0];
        int second = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                second = max;
                max = arr[i];
            } else if (arr[i] > second && arr[i] != max) {
                second = arr[i];
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,4,7,9,3};
        System.out.println("The second max no :"+ SecondMaxNo(arr));

    }
}