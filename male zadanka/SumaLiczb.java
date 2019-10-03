import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class SumaLiczb {
    public static void main(String[] args) {
        int a = 16;
        int wynik = 0;

        List lista = new ArrayList();
        ArrayDeque deq = new ArrayDeque();
       deq=podziel(a);
       for(int i=0;i<deq.size();i++){
           a=oblicz(deq);
           deq=podziel(a);
       }
       System.out.println(digital_root(543));


    }

    public static ArrayDeque podziel(int a){
        ArrayDeque deq = new ArrayDeque();
        while (a > 0) {
            deq.push(a % 10);
            a = a / 10;
        }
        return deq;
    }
    public static int oblicz (ArrayDeque deq){
        int wynik=0;
        int wysokosc=deq.size();
        for (int i = 0; i < wysokosc; i++) {
            wynik = wynik + (int) deq.pop();

        }


        return wynik;
    }
    public static int digital_root(int n) {
        while(n > 9){
            n = n/10 + n % 10;

        }
        return(n);
    }


}
