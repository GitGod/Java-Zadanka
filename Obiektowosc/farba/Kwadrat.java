package farba;

public class Kwadrat extends Czworokat {
    int bok;
    public Kwadrat(int bok) {
        this.bok=bok;

    }
    @Override
    public double obliczpole(){
        return this.bok*this.bok;
    }

}
