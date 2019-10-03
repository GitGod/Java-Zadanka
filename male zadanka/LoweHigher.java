import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LoweHigher {
    public static String HighAndLow(String numbers) {
        String[] podzilone = numbers.split(" ");
        int min;
        int max;
        int temp;
        max = min = Integer.parseInt(podzilone[0]);
        for (int i = 1; i < podzilone.length; i++) {
            temp = Integer.parseInt(podzilone[i]);
            if (min > temp) {
                min = temp;
            }
            if (max < temp) {
                max = temp;
            }
        }
        return max + " " + min;
    }
    public static String HighAndLow2(String numbers) {

        int min = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .min()
                .getAsInt();

        int max = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .max()
                .getAsInt();

        return String.format("%d %d", max, min);
    }
    public static void main(String[] args) {
        String i = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";
        System.out.println(HighAndLow(i));
    }
}
