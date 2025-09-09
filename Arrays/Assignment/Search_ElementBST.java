

public class Search_ElementBST {
    public static int Search_ElementBST(int nums[], int key) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) { // 2. // 4<=6 || 6
            // find mid
            int mid = (start + end) / 2; // 3 // 5 || 6
            System.out.println(mid);

            // comparison
            if (nums[mid] == key) { // 7==3 F // 1==3 || 2 == 3
                return mid;
            }
            // left side is sorted
            if (nums[start] <= nums[mid]) { // 4 <= 7 || 0 <=5 || 2 <=2
                if (key >= nums[start] && key < nums[mid]) { // 3 >= 4 && 3<7 || 3>=0 && 3<1 || 3>=2 && 3<6
                    end = mid - 1; // end = 5
                } else {
                    start = mid + 1; // start = 3+1 = 4 || start = 5+1 = 6
                }
            }
            // Right half is sorted
            else {
                if (key > nums[mid] && key <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int nums[] = { 4, 5, 6, 7, 0, 1, 2 }, target = 2;
        System.out.println(Search_ElementBST(nums, target));

    }
}
