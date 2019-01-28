package programowanieobiektowe;

import java.util.Scanner;

public class Gra {

 /*   public static int losuj() {
int min=1,max=100,range=max-min+1;
        int x= (int)(Math.random()*range)+min;
        return x;
    }*/
    // losowanie losuj = new losowanie();

    public static void podajNumer() {
        System.out.println("Podaj numerek");
    }

    public static void wygrana() {
        System.out.println("Wygrales");
    }

    public static void przegrana() {
        System.out.println("Przegrales");
    }


    public static void check(int x, int y) {
        if (x < y) {
            System.out.println("mniej");
        }
        if (x == y) {
            wygrana();
        }
        if (x > y) {
            System.out.println("wiecej");
        }
    }

    public static void rozgrywka(int szukanaLiczba) {
        int liczbaRuchow = 0, Podanaliczba = 0;
        Scanner scanner = new Scanner(System.in);
        while (Podanaliczba != szukanaLiczba && liczbaRuchow <= 5) {
            if (liczbaRuchow == 5) {
                Gra.przegrana();
                System.out.println("Dobra liczba to " + szukanaLiczba);
            } else {
                Gra.podajNumer();
                Podanaliczba = scanner.nextInt();
                Gra.check(szukanaLiczba, Podanaliczba);
            }
            liczbaRuchow++;
        }

    }
}
