package ulamek;

public class Main {
    public static void main(String[] args) {
        Ulamek ul1 = new Ulamek(1, 2);
        Ulamek ul2 = new Ulamek(3, 4);
        Ulamek ul3 = new Ulamek(1, 5);
       System.out.print("1 ulamek ");
        ul1.wysietl();
        System.out.print("2 ulamek ");
        ul2.wysietl();
        System.out.print("dodawanie ");
        ul3.dodaj(ul1, ul2);
        ul3.skroc();
        ul3.wysietl();
        System.out.print("odejmowanie ");
        ul3.odejmij(ul1, ul2);
        ul3.skroc();
        ul3.wysietl();
        System.out.print("mnozenie ");
        ul3.pomnoz(ul1, ul2);
        ul3.skroc();
        ul3.wysietl();
        System.out.print("dzielenie ");
        ul3.podziel(ul1, ul2);
        ul3.skroc();
        ul3.wysietl();


    }
}
