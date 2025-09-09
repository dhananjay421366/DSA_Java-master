public class isPalindrome {
    public static boolean isPalindrome(int arr[]) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] != arr[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2 };
        System.out.println(isPalindrome(arr));
    }
}
