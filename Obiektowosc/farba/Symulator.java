package farba;

import static java.lang.Math.ceil;

public class Symulator {
    private Figura[] tablicaFigur;


    public static int oblicz(Figura[] tablicaFigur, double pojemnosc) {
        double x = 0;
        double y = 0;
        for (int i = 0; i < tablicaFigur.length; i++) {
            if (tablicaFigur[i] != null) {
                x = tablicaFigur[i].obliczpole() / pojemnosc;
                y = y + x;
            }
        }
        y = ceil(y);
        return (int) y;
    }
}
