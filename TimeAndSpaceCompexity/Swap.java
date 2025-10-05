
public class Swap {

    public static void Swap(int arr[]) {

        // validation
        if (arr.length == 0) {
            return;
        }
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 9, 8};
        Swap(arr);

    }
}
