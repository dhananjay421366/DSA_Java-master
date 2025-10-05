/*
 * Time Complexity:

Best / Average = O(n log n)

Worst = O(n²)

Space Complexity:

Best / Average = O(log n)

Worst = O(n)
 */
class QuickSort {

    public static void quickSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        // partitioning
        // this return pivot index 
        int pInx = partition(arr, si, ei);
        // kaam 
        quickSort(arr, si, pInx - 1); // left part 
        quickSort(arr, pInx + 1, ei); // right part
    }

    public static int partition(int arr[], int si, int ei) {
        // pivot consider last element
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap them 
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 3, 7};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
