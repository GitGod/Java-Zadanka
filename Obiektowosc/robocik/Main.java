package robocik;

public class Main {
    public static void main(String[] args) {
        Robot r1 = new Robot(100,"Kappa",false);
        r1.poruszRobotem(RuchRobota.RUCH_REKA_LEWA);
        r1.wlaczRobota();
        r1.poruszRobotem(RuchRobota.RUCH_REKA_LEWA);
        r1.poruszRobotem(RuchRobota.SKOK);
        r1.poruszRobotem(RuchRobota.SKOK);
        r1.poruszRobotem(RuchRobota.SKOK);
        r1.poruszRobotem(RuchRobota.SKOK);
        r1.poruszRobotem(RuchRobota.SKOK);
        r1.naladujRobota();
        r1.wylaczRobota();
        r1.naladujRobota();
        r1.wlaczRobota();
        r1.poruszRobotem(RuchRobota.SKOK);
    }
}
