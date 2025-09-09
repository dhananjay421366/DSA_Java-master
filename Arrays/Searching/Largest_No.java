public class Largest_No {
    public static int Largest_Number(int[] nums) {
        int Largest_No = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (Largest_No < nums[i]) {
                Largest_No = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (smallest > nums[i]) {
                smallest = nums[i];
            }
        }
        return smallest;

    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 100, 3, 4, 5 };
        System.out.println(Largest_Number(arr));
    }
}
