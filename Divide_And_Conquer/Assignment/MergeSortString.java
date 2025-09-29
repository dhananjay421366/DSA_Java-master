
public class MergeSortString {

    public static String[] MergeSortString(String arr[], int si, int ei) {

        // base case 
        if (si == ei) {
            String[] A = {arr[si]};
            return A;
        }

        // kaam 
        // find mid 
        int mid = si + (ei - si) / 2;

        String[] left = MergeSortString(arr, si, mid);
        String[] right = MergeSortString(arr, mid + 1, ei);

        String[] finalarr = merge(left, right);
        return finalarr;

    }

    public static String[] merge(String[] arr1, String[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        String arr3[] = new String[m + n];

        int i = 0;
        int j = 0;
        int inx = 0;
        // loop 
        while (i < n && j < m) {
            if (isAlphabeticallySmaller(arr1[i], arr2[j])) {
                arr3[inx++] = arr1[i++];

            } else {
                arr3[inx++] = arr2[j++];
            }
        }

        while (i < n) {
            arr3[inx++] = arr1[i++];
        }

        while (j < n) {
            arr3[inx++] = arr2[j++];

        }

        return arr3;
    }

    public static boolean isAlphabeticallySmaller(String str1, String str2) {
        if (str1.compareTo(str2) < 0) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        String[] arr = {"sun", "earth", "mars", "mercury"};
        String a[] = MergeSortString(arr, 0, arr.length - 1);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }
    }
}
