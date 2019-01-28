package rek;

public class Algorytmy implements AlgorithmExercise {
    @Override
    public int nwd(int x, int y) {
        if (x < 0) {
            x = -x;
        }
        if (y < 0) {
            y = -y;
        }

        while (x != y) {
            if (x > y) {
                x = x - y;
            }
            if (x < y) {
                y = y - x;
            }
        }
        return x;
    }

    @Override
    public int nwdRecursive(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return nwdRecursive(b, a % b);
        }
    }

    @Override
    public long silnia(int n) {
        int i, s = 1;

        for (i = 1; i <= n; i++) {
            s = s * i;
        }
        return s;
    }

    @Override
    public long silniaRecursive(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * silnia(n - 1);
        }
    }

    @Override
    public long suma(int[] tab) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            suma = suma + tab[i];
        }
        return suma;
    }

    @Override
    public long sumaRecursive(int[] tab) {
        int n = tab.length;
        if (tab.length == 0) {
            return 0;
        }
        if (tab.length == 1) {
            return tab[0];
        } else {
            int[] y = new int[n - 1];
            for (int i = 0; i < y.length; i++) {
                y[i] = tab[i];
            }
            return tab[n - 1] + sumaRecursive(y);
        }

    }

    @Override
    public int fibonacci(int n) {
        int a = 0, b = 1;
        if (n == 0) {
            return a;
        } else if (n == 1) {
            return b;
        } else {
            for (int i = 0; i < n; i++) {
                b += a;
                a = b - a;
            }
        }
        return a;
    }

    @Override
    public int fibonacciRecursive(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }
}
