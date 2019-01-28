package robocik;

public class Robot {
    int poziomBateri;
    String nazwa;
    boolean wlaczony;

    public Robot(int poziomBateri, String nazwa, boolean wlaczony) {
        this.poziomBateri = poziomBateri;
        this.nazwa = nazwa;
        this.wlaczony = wlaczony;
    }

    public void poruszRobotem(RuchRobota ruchRobota) {
        if (wlaczony == true) {
            if (this.poziomBateri >= ruchRobota.getEnergia()) {
                System.out.println(ruchRobota.toString());
                poziomBateri -= ruchRobota.getEnergia();
            } else {
                System.out.println("nie mam dosc energii");
            }
        } else {
            System.out.println("jestem wylaczony");
        }
    }

    public void naladujRobota() {
        if (wlaczony == false) {
            poziomBateri = 100;
            System.out.println("robot naladowany");
        } else {
            System.out.println("robot jest wlaczony, nie mozna ladowac");
        }
    }

    public void wlaczRobota() {
        System.out.println("Wlaczam sie");
        wlaczony = true;
    }

    public void wylaczRobota() {
        System.out.println("Wylaczam sie");
        wlaczony = false;
    }
}
