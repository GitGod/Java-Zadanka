package Zajezdnie;

public class Main {
    public static void main(String[] args) {
        ZajezdniaTramwajowa z1 = new ZajezdniaTramwajowa("ChyloniaT");
        ZajezdniaAutobusowa z2 = new ZajezdniaAutobusowa("ChyloniaA");
        Autobus a1 = new Autobus(50, 12, z2, 20);
        Autobus a2 = new Autobus(40, 15, z2, 50);
        Autobus a3 = new Autobus(60, 35, z2, 12);
        Autobus a4 = new Autobus(100, 43, z2, 200);
        Tramwaj t1 = new Tramwaj(50, 3, z1, 2);
        Tramwaj t2 = new Tramwaj(50, 5, z1, 1);
        Tramwaj t3 = new Tramwaj(50, 6, z1, 3);
        Tramwaj t4 = new Tramwaj(50, 8, z1, 2);
        z1.dodajTramwaj(t1);
        z1.dodajTramwaj(t2);
        z1.dodajTramwaj(t3);
        z1.dodajTramwaj(t4);
        z2.dodajAutobus(a1);
        z2.dodajAutobus(a2);
        z2.dodajAutobus(a3);
        z2.dodajAutobus(a4);
        System.out.println(z2.toString());
        System.out.println(z1.toString());
    }
}
