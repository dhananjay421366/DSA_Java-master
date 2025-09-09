public class MaxSubArraySum {
    public static void MaxSubArraySum(int nums[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];

        prefix[0] = nums[0];
        // canculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];

        }

        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < currentSum) {
                    maxSum = currentSum;

                }

            }
        }
        System.out.println("Max sum is : " + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        MaxSubArraySum(numbers);

    }
}
