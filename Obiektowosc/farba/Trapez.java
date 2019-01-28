package farba;

public class Trapez extends Czworokat {
    int bok;
    int bok2;
    int wysokosc;
    public Trapez(int bok,int bok2,int wysokosc) {
        this.bok=bok;
        this.bok2=bok2;
        this.wysokosc=wysokosc;

    }
    @Override
    public double obliczpole(){
        return (this.bok+this.bok2)*this.wysokosc/2;
    }
}
