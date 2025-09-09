public class InsertionSort {
    public static void InsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int currentElement = arr[i];
            int prevElement = i - 1;
            // finding out the correct pos to inset
            while (prevElement >= 0 && arr[prevElement] > currentElement) {
                arr[prevElement + 1] = arr[prevElement];
                prevElement--;
            }
            // insertion
            arr[prevElement + 1] = currentElement;

        }
    }

    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        InsertionSort(arr);
        PrintArray(arr);
    }
}
