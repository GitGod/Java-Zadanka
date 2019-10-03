package Codility;

import java.util.Random;

public class LongestTableWithTwoNumbersOccurences {
    public static void main(String[] args) {
        Random x = new Random();
        int[] A = new int[5];
        A[0] = 5;
        A[1] = 6;
        A[2] = 6;
        A[3] = 5;
        A[4] = 3;
        int a = 5;
        int b = 6;
        System.out.println(solution(a, b, A));

    }

    public static int solution(int X, int Y, int[] A) {
        int N = A.length;
        int result = -1;
        int nX = 0;
        int nY = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == X)
                nX += 1;
            else if (A[i] == Y)
                nY += 1;
            if (nX == nY && nX > 0)
                result = i;
        }
        return result;
    }
}
