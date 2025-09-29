
public class MejorityElement {

    public static int MejorityElement(int arr[]) {
        int count = 1;
        int cadidate = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == cadidate) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                cadidate = arr[i];
                count = 1;
            }
        }

        return cadidate;

    }

    public static void main(String[] args) {

        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(MejorityElement(nums));


    }
}
