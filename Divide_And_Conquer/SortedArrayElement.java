
public class SortedArrayElement {

    public static int search(int arr[], int target, int si, int ei) {
        int mid = si + (ei - si) / 2;
        int i = 0;

        // for left half 
        for (i = si; i <= mid; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        // for rigth half
        for (i = mid + 1; i <= ei; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return i;

    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};  // sorted + rotated
        int key = 1;
        int index = search(arr, key, 0, arr.length - 1);
        System.out.println(index);
    }
}
