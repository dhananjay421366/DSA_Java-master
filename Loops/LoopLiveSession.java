import java.util.Scanner;

public class LoopLiveSession {
    public static void main(String args[]) {
        // get n inputs from user and find sum of even and odd no
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        System.out.println("Enter the no of Element");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int Element = sc.nextInt();

            if (Element % 2 == 0) {
                even += Element;
            } else {
                odd += Element;
            }
        }
        System.out.println(even);
        System.out.println(odd);

    }
}
