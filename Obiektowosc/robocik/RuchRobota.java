package robocik;

public enum RuchRobota {
    KROK_LEWA(5),
    KROK_PRAWA(5),
    RUCH_REKA_LEWA(10),
    RUCH_REKA_PRAWA(10),
    SKOK(20);
    private double energia;

    RuchRobota(double energia) {
        this.energia = energia;
    }

    public double getEnergia() {
        return energia;
    }
}
