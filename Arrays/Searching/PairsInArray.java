public class PairsInArray {
    // formula = n(n-1)/2
    public static void PairsInArray(int nums[]) {
        int total_pairs = 0;
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i]; // 2,4,6,8,
            for (int j = i + 1; j < nums.length; j++) {
                System.out.print("(" + current + "," + nums[j] + ")" + " ");

                total_pairs++;
            }
            System.out.println();
        }
        System.out.println("The total pairs is :" + total_pairs);
    }

    public static void main(String args[]) {
        int nums[] = { 2, 4, 6, 8, 10 };
        PairsInArray(nums);

    }
}
