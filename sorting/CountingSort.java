public class CountingSort {
    public static void Counting_sort(int arr[]) {

        // Algorithm
        // 1. find max from arr
        // 2. create new count arr with length max+1
        // 3.store an freq of each ele in count arr
        // 4. build the sorted arr

        // 1. find max from arr
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // 2. create new count arr with length max+1
        int count[] = new int[largest + 1];

        // 3.store an freq of each ele in count arr

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // 4. build the sorted arr
        int j = 0;
        for (int i = 0; i < count.length - 1; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 7, 9, 14, 16 };
        Counting_sort(arr);
        PrintArr(arr);

    }
}
