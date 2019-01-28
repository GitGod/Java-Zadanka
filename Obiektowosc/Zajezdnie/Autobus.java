package Zajezdnie;

public class Autobus extends Pojazd {
    double ZuzyciePaliwa;

    public Autobus(int predkoscMaksymalna, int numer, Zajezdnia zajezdnia, double zuzyciePaliwa) {
        super(predkoscMaksymalna, numer, zajezdnia);
        ZuzyciePaliwa = zuzyciePaliwa;
    }

    public String toString() {
        return "Hej mam numer " + this.numer + " posiadam predkosc maksymalna " + this.predkoscMaksymalna + " km/h  i zuzylem w tym miesiacu " + this.ZuzyciePaliwa + " litrow paliwa";

    }

}
