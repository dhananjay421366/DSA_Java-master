class Solution {
    public int subarraySum(int[] nums, int k) {
        int result = 0;
        int totalSumOfSubArray = 0;
        for (int i = 0; i < nums.length; i++) {
            int subArraySum = 0;
            for (int j = i; j < nums.length; j++) {
                subArraySum += nums[j];
                if (subArraySum == k) {
                    result++;
                }

            }

        }
        return result;
    }
}
