import java.util.Arrays;

public class SeriesSUm {
    public static String seriesSum(int n) {
     double x=1;
      double a=4;
      double wynik=1;
      String kappa;
       if(n==0)return "0.00";
       if(n==1)return "1.00";
       if(n>1){
           for(int i=2;i<=n;i++){
              wynik= wynik+1/a;
              a=a+3;
           }

       }
       kappa= String.format("%.2f%n", wynik);
       kappa=kappa.replace(',','.');
       return kappa;
    }

    public static String seriesSum2(int n) {

        double sum = 0.0;
        for (int i = 0; i < n; i++)
            sum += 1.0 / (1 + 3 * i);

        return String.format("%.2f", sum);

    }
    public static void main(String[] args) {
        System.out.println(seriesSum2(5));
    }
    }
