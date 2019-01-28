package farba;

import static java.lang.Math.PI;

public class Kolo extends Figura {
    int promien;

    public Kolo(int promien) {
        this.promien=promien;
    }

    @Override
    public double obliczpole(){
        double pole = PI*this.promien*this.promien;
        return pole;
    }


}
