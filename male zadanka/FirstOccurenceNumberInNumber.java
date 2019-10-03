package Codility;

import java.util.Stack;

public class FirstOccurenceNumberInNumber {
    public static void main(String[] args) {
        int B = 1953786;
        int A = 53;
        System.out.println(solution(A,B));
    }

    public static int solution(int A, int B) {
        String AA = Integer.toString(A);
        String BB = Integer.toString(B);

        for (int i = 0; i < BB.length(); i++) {
            if (BB.substring(i,i+AA.length()).equals(AA)) {

                return i;
            }
        }
        return -1;
    }}