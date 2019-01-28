package Stosy;
public class Main {
    public static void main(String[] args) {
        Stosik stos = new Stosik(5);
        stos.push(4);
        stos.push(3);
        stos.print();
        System.out.println(stos.getSize());
        stos.pop();
        stos.pop();
        stos.pop();
        stos.print();
        stos.push(2);
        stos.print();
    }
}
