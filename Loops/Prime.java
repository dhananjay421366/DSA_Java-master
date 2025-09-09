public class Prime {
    public static void main(String args[]) {
        int num = 11;
        int factor = 0;
        if (num < 0) {
            return;
        }
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factor++;
            }
        }
        if(factor == 2){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");

        }

    }
}
