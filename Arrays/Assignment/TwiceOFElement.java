import java.util.*;

public class TwiceOFElement {
    public static boolean TwiceOFElement(int nums[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, -4, -4 };
        System.out.println(TwiceOFElement(nums));

    }
}
