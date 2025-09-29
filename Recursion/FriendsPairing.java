
/* 
 * Formula :: f(n)=f(n−1)+(n−1)×f(n−2)
 */
public class FriendsPairing {

    public static int FriendsPairing(int n) {
        // base case
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        // choice 
        // single or paired
        int single = FriendsPairing(n - 1);
        // pair
        int pair = (n - 1) * FriendsPairing(n - 2);

        return single + pair;

    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(FriendsPairing(n));
    }
}
