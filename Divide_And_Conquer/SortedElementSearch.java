
public class SortedElementSearch {

    public static int search(int arr[], int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }

        // kaam
        int mid = si + (ei - si) / 2;

        // Case FOUND  AT MID 
        if (arr[mid] == target) {
            return mid;
        }

        // case 1 mid on L1
        if (arr[si] <= arr[mid]) {

            // case A:
            if (arr[si] <= target && target <= arr[mid]) {
                // left
                return search(arr, target, si, mid - 1);
            } else {
                // case B : right
                return search(arr, target, mid + 1, ei);
            }
        } // case 2  mid on L2
        else {
            // case C:
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            } else {
                // Case D : left 
                return search(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};  // sorted + rotated
        int key = 4;
        int index = search(arr, key, 0, arr.length - 1);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + index + " (value = " + arr[index] + ")");
        }

    }
}
