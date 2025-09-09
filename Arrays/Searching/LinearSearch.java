public class LinearSearch {
    public static int LinearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int LinearSearchForString(String friends[], String key) {
        for (int i = 0; i < friends.length; i++) {
            if (friends[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int key = 1;
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int index = LinearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Key are not found !");
        } else {
            System.out.println("Key is found at :" + index);
        }

        String key2 = "Dhananjay";
        String friends[] = { "Dhananjay", "Pratap", "Vaishnav" };
        int index2 = LinearSearchForString(friends, key2);

        if (index2 == -1) {
            System.out.println("The key is Not found !");
        } else {
            System.out.println("The key is found at :" + index2);
        }
    }

}
