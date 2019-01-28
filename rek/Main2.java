package rek;

public class Main2 {
    public static void main(String[] args) {
        int[] y = new int[]{1, 3, 5, 10, 12};
        Main m = new Main();
        System.out.println(m.fibonacciRecursive(5));
        System.out.println(m.fibonacci(5));
        System.out.println(m.nwd(4, 6));
        System.out.println(m.nwdRecursive(4, 6));
        System.out.println(m.silnia(5));
        System.out.println(m.silniaRecursive(5));
        System.out.println(m.suma(y));
        System.out.println(m.sumaRecursive(y));
    }
}
