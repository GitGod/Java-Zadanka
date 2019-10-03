import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Merge {
    public static String[] uniqueNames(String[] names1, String[] names2) {
      TreeSet temp = new TreeSet();
        String[] x =  new String[]{};
        Stream<String> stream1 = Stream.of(names1);
        Stream<String> stream2 = Stream.of(names2);
        for(int i=0 ; i<names1.length;i++){
            temp.add(names1[i]);
        }
        for(int i=0 ; i<names2.length;i++){
            temp.add(names2[i]);
        }
      //  for(){
       //    x[i]=temp.f
      //  }
        return x;
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", Merge.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
