public class PrintSubArrays {
    // subArray = a continuous part of array
    // formula = n(n+1) /2
    // find sum of subarray
    public static void PrintSubArrays(int nums[]) {
        int total_subArray = 0;
        int TotalSum = 0;
        int Max_Sum = Integer.MIN_VALUE;
        int Min_Sum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = start; j < nums.length; j++) {
                int end = j;
                int subArraySum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(nums[k] + " ");
                    subArraySum += nums[k];
                    // if (Max_Sum < subArraySum) {
                    // Max_Sum = subArraySum;
                    // }
                    // if (Min_Sum > subArraySum) {
                    // Min_Sum = subArraySum;
                    // }

                }
                // TotalSum += subArraySum;
                // total_subArray++;
                System.out.println("=> Subarray Sum: " + subArraySum);

            }
            System.out.println();
        }
        // System.out.println("The total total_subArray is " + total_subArray);
        // System.out.println("The Max total_subArray sum is " + Max_Sum);
        // System.out.println("The Min total_subArray sum is " + Min_Sum);
        // System.out.println(TotalSum);

    }

    public static void main(String args[]) {
        int numbers[] = { 1, 1, 1 };
        PrintSubArrays(numbers);

    }

}
