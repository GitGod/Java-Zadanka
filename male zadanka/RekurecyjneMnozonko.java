public class RekurecyjneMnozonko {
    public static void main(String[] args) {
        System.out.println(mnoz(5, -7));
    }

    public static int mnoz(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        } else if (b < 0) {
            return -mnoz(a, -b);
        } else if (a < 0) {
            return -mnoz(-a, b);
        } else if (a == 1) {
            return b;
        } else {
            return mnoz(a - 1, b) + b;
        }

    }


}
