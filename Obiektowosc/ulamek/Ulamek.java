package ulamek;

public class Ulamek {
    private int licznik;
    private int mianownik;

    public Ulamek(int licznik, int mianownik) {
        this.licznik = licznik;
        this.mianownik = mianownik;

    }

    public void dodaj(Ulamek ul1, Ulamek ul2) {
        this.mianownik = ul1.mianownik * ul2.mianownik;
        this.licznik = (ul1.licznik * ul2.mianownik) + (ul2.licznik * ul1.mianownik);
    }

    public void odejmij(Ulamek ul1, Ulamek ul2) {
        this.mianownik = ul1.mianownik * ul2.mianownik;
        this.licznik = (ul1.licznik * ul2.mianownik) - (ul2.licznik * ul1.mianownik);
    }

    public void pomnoz(Ulamek ul1, Ulamek ul2) {
        this.mianownik = ul1.mianownik * ul2.mianownik;
        this.licznik = ul1.licznik * ul2.licznik;
    }

    public void podziel(Ulamek ul1, Ulamek ul2) {
        this.licznik = ul1.licznik * ul2.mianownik;
        this.mianownik = ul1.mianownik * ul2.licznik;
    }

    public void wysietl() {
        System.out.println(this.licznik + "/" + this.mianownik);
    }

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

    public void skroc() {
        while (nwd(this.licznik, this.mianownik) != 1) {
            int x = nwd(this.licznik, this.mianownik);
            this.licznik = this.licznik / x;
            this.mianownik = this.mianownik / x;
        }


    }


}
