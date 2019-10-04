import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Flamaster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      //  int ilosc = scanner.nextInt();
        String slowo = "AAABBCCRRD";
        String skroconeslowo="";
        Integer liczba=0;
        skroconeslowo=skroconeslowo.concat(String.valueOf(slowo.charAt(0)));
        for(int i=1 ; i<slowo.length();i++){
            if(skroconeslowo.charAt(i-1)==slowo.charAt(i)){
                liczba++;
                skroconeslowo=skroconeslowo.concat(String.valueOf(slowo.charAt(i)));
            }
            else{
                skroconeslowo.substring(0,skroconeslowo.length()-liczba);
                skroconeslowo=skroconeslowo.concat(liczba.toString()+slowo.charAt(i));
                liczba=0;
            }
        }
        System.out.println(skroconeslowo);
    }
}
