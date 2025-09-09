public class Trap {
    public static int TrapWater(int heigth[]) {
        int n = heigth.length - 1;
        int i = 0;
        int LeftMax = heigth[i];
        int RightMax = heigth[n];
        int result = 0;

        while (i < n) {
            if (LeftMax < RightMax) {
                i++;
                LeftMax = Math.max(LeftMax, heigth[i]);
                result += LeftMax - heigth[i];
            } else {
                n--;
                RightMax = Math.max(RightMax, heigth[n]);
                result += RightMax - heigth[n];
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int heigth[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(TrapWater(heigth));

    }
}
