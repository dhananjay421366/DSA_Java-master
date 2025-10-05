
public class BubbleSort {

    // method to check if array is already sorted
    public boolean isSorted(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // not sorted
            }
        }
        return true; // sorted
    }

    public void bubbleSort(int arr[]) {
        if (arr.length == 0) {
            return;
        }

        // check before sorting
        if (isSorted(arr)) {
            System.out.println("Array is already sorted");
        } else {
            // do bubble sort
            for (int i = 0; i < arr.length - 1; i++) {
                boolean swap = false;
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j + 1];
                        arr[j + 1] = arr[j];
                        arr[j] = temp;
                        swap = true;
                    }
                }
                if (!swap) {
                    break; // array became sorted early
                }
            }
            System.out.println("Array was not sorted, now sorted:");
        }

        // print final array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int temp1[] = {2, 3, 4, 5, 6};    // already sorted
        int temp2[] = {2, 3, 4, 5, 6, 4}; // not sorted

        BubbleSort b = new BubbleSort();

        System.out.println("Test 1:");
        b.bubbleSort(temp1);

        System.out.println("\nTest 2:");
        b.bubbleSort(temp2);
    }
}
