package Zajezdnie;

import java.util.ArrayList;

public class ZajezdniaTramwajowa extends Zajezdnia {
    ArrayList<Tramwaj> Tramwaje = new ArrayList<Tramwaj>();

    public ZajezdniaTramwajowa(String nazwa) {
        super(nazwa);
    }

    public void dodajTramwaj(Tramwaj tramwaj) {
        this.Tramwaje.add(tramwaj);
    }

    public String toString() {
        int suma = 0;
        String napis = "";
        napis = napis.concat("Tramwajowa zajezdnia " + this.nazwa);
        for (Tramwaj tramwaj : this.Tramwaje) {
            napis = napis.concat("\n" + tramwaj.toString());
            suma += tramwaj.liczbaWagonow;
        }
        napis = napis.concat("\n" + "Laczna liczba wagonow to " + suma);
        return napis;
    }
}
