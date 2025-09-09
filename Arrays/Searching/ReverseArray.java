public class ReverseArray {
    public static void ReverseArray(int nums[]) {
        int first = 0;
        int last = nums.length - 1; // 4
        while (first < last) { // 0<4
            // swap
            int temp = nums[last]; // nums[4] = 10
            nums[last] = nums[first]; // nums[4] = nums[0]
            nums[first] = temp;

            first++;
            last--;

        }

    }

    public static void main(String args[]) {
        // int nums[] = { 2, 4, 6, 8, 10 };
        int nums[] = { 2, 1, 35, 6, 4, 10 };
        ReverseArray(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
