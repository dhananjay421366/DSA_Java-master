public class AssignmentQue6 {
    public static void main(String args[]) {
        for (int i = 0; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println(" i after the loop : " + i);  // this line occur error due to scope of variable
    }
}
