package rek;

public class Main {
    public static void main(String[] args) {
        int[] y = new int[]{1, 3, 5, 10, 12};
        Algorytmy alg = new Algorytmy();
        System.out.println(alg.fibonacciRecursive(5));
        System.out.println(alg.fibonacci(5));
        System.out.println(alg.nwd(4, 6));
        System.out.println(alg.nwdRecursive(4, 6));
        System.out.println(alg.silnia(5));
        System.out.println(alg.silniaRecursive(5));
        System.out.println(alg.suma(y));
        System.out.println(alg.sumaRecursive(y));
    }
}
