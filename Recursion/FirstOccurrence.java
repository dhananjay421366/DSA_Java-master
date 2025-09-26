
public class FirstOccurrence {

    public static int FirstOccurrence(int arr[], int target, int index) {
        if (arr.length == 0) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return FirstOccurrence(arr, target, index + 1);

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 6, 2, 4, 6, 7};
        int index = 0;
        int target = 4;
        System.out.println(FirstOccurrence(arr, target, index));

    }
}
