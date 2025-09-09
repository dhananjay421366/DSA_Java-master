public class MaxSubArraySumOptimized {
    public static void kadanes(int nums[]) {
        int currentSum = 0;
        int ms = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            currentSum = currentSum + nums[i];

            if (currentSum < 0) {
                currentSum = 0;
            }
            if (ms < currentSum) {
                ms = currentSum;
            }
        }
        System.out.println("The max subarray sum is :" + ms);

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        kadanes(numbers);

    }

}
