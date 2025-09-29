
public class InversionCount {

    public static int InversionCount(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return 0;
        }

        int count = 0;
        int mid = si + (ei - si) / 2;

        // kaam
        count += InversionCount(arr, si, mid);
        count += InversionCount(arr, mid + 1, ei);
        count += merge(arr, si, mid, ei);

        return count;

    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6};
        int count = InversionCount(arr, 0, arr.length - 1);
        System.out.println(count);

    }

    private static int merge(int[] arr, int si, int mid, int ei) {

        int swap = 0;
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];

            } else {
                temp[k++] = arr[j++];
                swap += (mid - i + 1);
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // now copy temp to original arr 
        for (k = 0, i = si; k < temp.length; i++, k++) {
            arr[i] = temp[k];
        }
        return swap;
    }
}
