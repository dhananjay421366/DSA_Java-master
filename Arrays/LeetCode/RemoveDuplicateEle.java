public class RemoveDuplicateEle {
    public static int[] removeDuplicateElement(int arr[]) {
        int[] unique = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < index; j++) {
                if (arr[i] == unique[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique[index++] = arr[i];
            }
        }
         // Trim the array to size `index`
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = unique[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 6, 7, 7, 3, 9 };
        int res[] = removeDuplicateElement(arr);

        System.out.print("Unique elements: ");
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}
