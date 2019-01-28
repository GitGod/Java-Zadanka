package programowanieobiektowe;

public class Main {
    public static void main(String[] args) {
        losowanie losowanko = new losowanie();
        Gra.rozgrywka(losowanko.losuj());
    }

}

