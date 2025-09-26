
import java.util.ArrayList;
import java.util.List;

public class ArraysKeyElement {

    public static List<Integer> ArraysKeyElement(int arr[], int key, int index) {

        List<Integer> li = new ArrayList<>();

        // base case
        if (index == arr.length) {
            return li;
        }

        // if current index matches, add it
        if (arr[index] == key) {
            li.add(index);
        }

        // get results from recursion
        List<Integer> nextList = ArraysKeyElement(arr, key, index + 1);

        // merge current result with recursion result
        li.addAll(nextList);

        return li;
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2}, key = 2;
        int index = 0;
        System.out.println(ArraysKeyElement(arr, key, index));

    }
}
