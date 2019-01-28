package farba;

public class Main {
    public static void main(String[] args) {
        Kwadrat kw1 = new Kwadrat(5);
        Kwadrat kw2 = new Kwadrat(7);
        Kolo ko1 = new Kolo(5);
        Kolo ko2 = new Kolo(7);
        Trapez tr1 = new Trapez(5, 2, 5);
        Figura[] tablicaFigur = new Figura[]{kw1, kw2, ko1, ko2, tr1};
        int suma = (int) Symulator.oblicz(tablicaFigur, 5);
        System.out.println("lacznie potrzeba " + suma + " puszek");
    }
}
