public class ArraysArgument {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
            System.out.println(marks[i]);
        }

    }

    public static void main(String args[]) {
        int marks[] = { 97, 98, 99 };
        System.out.println("Original Array is : ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("Updated  Array values  by each  1  : ");
        update(marks);
    }
}