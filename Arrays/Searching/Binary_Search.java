public class Binary_Search {
    // Pseudo Code
    // TODO
    // only apply on Sorted data

    // start = 0 , end = n-1
    // while(start <= end)
    // find mid = (start +end) /2
    // compare mid and key == return mid
    // mid < key
    // start = mid +1;
    // else end = mid -1;

    public static int Binary_Search(int nums[], int key) {

        int start = 1;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // comparison
            if (nums[mid] == key) {
                return mid;
            }
            // check mid is less then key or not !
            if (nums[mid] < key) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }

        }

        return -1;
    }

    public static void main(String args[]) {
        // only apply on sorted array

        int nums[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 10;
        System.out.println(Binary_Search(nums, key));

    }
}
