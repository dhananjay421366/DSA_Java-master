
class Solution {

    public static void subarraySum(int[] nums, int k) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            int subArraySum = 0;
            for (int j = i; j < nums.length; j++) {
                subArraySum += nums[j];
                // if (subArraySum == k) {
                // print this subarray
                System.out.print("Subarray: { ");
                for (int l = i; l <= j; l++) {
                    System.out.print(nums[l] + " ");
                }
                System.out.println("}");
                // }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 0, 0, 3};
        subarraySum(arr, 3);
    }
}
