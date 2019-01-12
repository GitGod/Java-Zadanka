//Podaj sumę wszystkich liczb z przedziału od 0 do liczby podanej przez uzytkownika (skorzystaj z pętli for).

import java.util.Scanner;
public class SumaLiczb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wpisz liczbe");

       int x = scanner.nextInt();
       int suma=0;
        for (int i = 1; i <= x; i++) 
        {
            suma=suma+i;
        }
        System.out.println("suma wynosi "+ suma);

      }}
