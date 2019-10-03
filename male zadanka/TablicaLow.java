package Codility;

public class TablicaLow {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4};
        System.out.println(kappa(a));
    }

    public static int kappa(int[] a) {
        boolean x = false;
        int y = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == y) {
                x = true;
            }
            if (x == false) {
                return y;
            }
        }


        return 5;
    }


}
