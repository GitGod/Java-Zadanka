import java.util.ArrayDeque;
import java.util.ArrayList;

public class SortujLiczby {
    public static void main(String[] args) {
        int a=1314;
        ArrayList deq = new ArrayList();
        while (a > 0) {
            deq.add(a % 10);
            a = a / 10;
        }
      //  deq.stream().sorted().toArray();
        System.out.println(deq.stream().sorted().toArray());

    }
}
