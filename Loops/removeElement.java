// public class SumOfFirstNaturalNo {

// }
public class removeElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                System.out.println(nums[k]);
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        removeElement sc = new removeElement();
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        sc.removeElement(nums, val);
    }
}