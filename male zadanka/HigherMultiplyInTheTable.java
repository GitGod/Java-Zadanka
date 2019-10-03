package Codility;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HigherMultiplyInTheTable {
    public static void main(String[] args) {
       double A[] = new double[9];
        A[0] =  1.0 ;   A[1] = 0.1 ;   A[2] = -1.0;
        A[3] = -7.0;    A[4] = 3.0 ;   A[5] = -5.0;
        A[6] = -2.5 ;   A[7] = 0.0 ;   A[8] =  1.0;
        System.out.println(solution(A));
    }

    public static double solution(double[] A) {
       double wynik=1.0;
       double max=0.0;
       for(int i=0;i<A.length;i++){
           for(int j=i;j<A.length;j++){
               wynik=wynik*A[j];
               if(wynik>1000000000.0)
               {
                   return 1000000000.0;
               }
               if (max<wynik){
                   max=wynik;
               }
           }
           wynik=1.0;
       }
       return max;
    }
}
