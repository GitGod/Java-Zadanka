import java.util.LinkedList;

public class Litera {
    public static void main(String[] args) {
        String wyraz ="kebabo";
        LinkedList list = new LinkedList();
        for(int i=0;i<wyraz.length();i++){
            if(list.contains(wyraz.charAt(i))){
                System.out.println(wyraz.charAt(i));
            }
            list.add(wyraz.charAt(i));
        }

    }
}
