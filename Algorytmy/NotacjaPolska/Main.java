package NotacjaPolska;

public class Main {
    public static void main(String[] args) {
        String dzialanko = "5-8/4+(2+2)";
        Notacja n1 = new Notacja();
        n1.ZamienNaNotacje(dzialanko);
        n1.wypisz();
        System.out.println();
        System.out.println(n1.oblicz().peek());


    }
}
