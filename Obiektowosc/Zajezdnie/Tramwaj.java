package Zajezdnie;

public class Tramwaj extends Pojazd {
    int liczbaWagonow;

    public Tramwaj(int predkoscMaksymalna, int numer, Zajezdnia zajezdnia, int liczbaWagonow) {
        super(predkoscMaksymalna, numer, zajezdnia);
        this.liczbaWagonow = liczbaWagonow;
    }

    public String toString() {
        return "Hej mam numer " + this.numer + " posiadam predkosc maksymalna " + this.predkoscMaksymalna + " km/h  a moja liczba wagownow wynosi " + this.liczbaWagonow;

    }

}
