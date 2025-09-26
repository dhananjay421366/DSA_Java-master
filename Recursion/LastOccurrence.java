
public class LastOccurrence {

    public static int LastOccurrence(int arr[], int key, int index) {

        if (arr.length == index) {
            return -1;
        }
        int isFound = LastOccurrence(arr, key, index + 1);

        if (isFound == -1 && arr[index] == key) {
            return index;

        }
        return isFound;

    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 9, 4};
        int key = 4;
        int index = 0;

        System.out.println(LastOccurrence(arr, key, index));

    }
}
