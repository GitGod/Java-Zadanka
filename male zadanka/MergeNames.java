import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        int i,j;
        ArrayList nazwiska = new ArrayList();
        for(i=0;i<names1.length;i++){
            if(!nazwiska.contains(names1[i])){
                nazwiska.add(names1[i]);
            }
        }
        for(i=0;i<names2.length;i++){
            if(!nazwiska.contains(names2[i])){
                nazwiska.add(names2[i]);
            }
        }
        String[] names3 = new String[nazwiska.size()];
        for(i=0;i<names3.length;i++){
           names3[i]=nazwiska.get(i).toString();
        }
        return names3;
    }


    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }

}