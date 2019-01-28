package programowanieobiektowe;

public class losowanie {
    // int liczba;
    public losowanie() {

    }

    public int losuj() {
        int min = 1, max = 100, range = max - min + 1;
        int liczba = (int) (Math.random() * range) + min;
        return liczba;
    }
}
