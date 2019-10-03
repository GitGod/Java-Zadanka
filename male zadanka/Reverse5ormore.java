import java.util.Stack;
import java.util.zip.Deflater;

public class Reverse5ormore {
    public static String spinWords(String sentence) {
        String newSentence="";
        String[] podzielone=sentence.split(" ");
        for(int i=0;i<podzielone.length;i++) {
            if (podzielone[i].length() > 4) {
                podzielone[i] = palindrome(podzielone[i]);
            }
            if (podzielone.length == 1) {
                newSentence = newSentence.concat(podzielone[i]);
            } else {
                if (i == podzielone.length - 1) {
                    newSentence = newSentence.concat(podzielone[i]);
                }
                newSentence = newSentence.concat(podzielone[i] + " ");
            }
        }
            return newSentence;
    }
public static String palindrome(String word){
    Stack x = new Stack();
    String word2="";
    for(int i=0;i<word.length();i++){
        x.push(word.charAt(i));
    }
    for(int i=0;i<word.length();i++){
        word2=word2.concat(String.valueOf(x.pop()));
    }
 return word2;
}


    public static void main(String[] args) {
        String x = "Welcome";
       System.out.println(spinWords(x));
    }

}
