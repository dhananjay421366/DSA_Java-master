public class LiveSession {
    public static void main(String args[]) {

        // for (int i = 1; i <= 3; i++) { // row

        //     for (int j = 1; j <= 4; j++) { // col
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        char ch = 'A';
        for(int i = 1; i<=4;i++){
            for(int j =1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}