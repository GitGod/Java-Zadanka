package Zajezdnie;

import java.util.ArrayList;

public class ZajezdniaAutobusowa extends Zajezdnia {
    ArrayList<Autobus> busy = new ArrayList<Autobus>();

    public ZajezdniaAutobusowa(String nazwa) {
        super(nazwa);
    }

    public void dodajAutobus(Autobus autobus) {
        this.busy.add(autobus);
    }

    public String toString() {
        double suma = 0;
        String napis = "";
        napis = napis.concat("Autobusowa zajezdnia " + this.nazwa);
        for (Autobus autobus : this.busy) {
            napis = napis.concat("\n" + autobus.toString());
            suma += autobus.ZuzyciePaliwa;
        }
        napis = napis.concat("\n" + "Liczba litrow zuzyta to " + suma);
        return napis;
    }
}
