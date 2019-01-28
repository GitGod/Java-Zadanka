package Zajezdnie;

public class Pojazd {
    public int predkoscMaksymalna;
    public int numer;
    public Zajezdnia zajezdnia;

    public Pojazd(int predkoscMaksymalna, int numer, Zajezdnia zajezdnia) {
        this.predkoscMaksymalna = predkoscMaksymalna;
        this.numer = numer;
        this.zajezdnia = zajezdnia;
    }
}
