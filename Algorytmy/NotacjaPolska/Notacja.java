package NotacjaPolska;

import java.util.ArrayDeque;

public class Notacja {
    ArrayDeque kolejka = new ArrayDeque();
    ArrayDeque kolejka2 = new ArrayDeque();
    ArrayDeque stos = new ArrayDeque();
    ArrayDeque wynik = new ArrayDeque();

    public void ZamienNaNotacje(String wyrazenie) {
        for (int i = 0; i < wyrazenie.length(); i++) {
            if (wyrazenie.charAt(i) == '+' || wyrazenie.charAt(i) == '-') {
                if (stos.size() != 0) {
                    do {
                        if ((char) stos.peek() == '(') {
                            break;
                        }
                        kolejka.add(stos.pop());
                    }
                    while (stos.size() != 0);
                }
                stos.push(wyrazenie.charAt(i));
            } else if (wyrazenie.charAt(i) == '*' || wyrazenie.charAt(i) == '/') {
                if (stos.size() != 0) {
                    do {
                        if ((char) stos.peek() == '(' || (char) stos.peek() == '+' || (char) stos.peek() == '-') {
                            break;
                        }
                        kolejka.add(stos.pop());
                    }
                    while (stos.size() != 0);
                }
                stos.push(wyrazenie.charAt(i));
            } else if (wyrazenie.charAt(i) == '(') {
                stos.push(wyrazenie.charAt(i));


            } else if (wyrazenie.charAt(i) == ')') {
                do {
                    kolejka.add(stos.pop());
                }
                while ((char) stos.pop() != '(');
            } else {
                kolejka.add(wyrazenie.charAt(i));
            }
        }
        while (!stos.isEmpty()) {
            kolejka.add(stos.pop());
        }
        kolejka2 = kolejka.clone();
    }

    public ArrayDeque oblicz() {

        int wyniko;
        int pom;
        while (!kolejka.isEmpty()) {
            if ((char) kolejka.peek() == '+') {
                wynik.push(Integer.parseInt(String.valueOf(wynik.pop())) + Integer.parseInt(String.valueOf(wynik.pop())));
                kolejka.remove();
            } else if ((char) kolejka.peek() == '-') {
                int a = (int) Integer.parseInt(String.valueOf(wynik.pop()));
                int b = (int) Integer.parseInt(String.valueOf(wynik.pop()));
                wynik.push(b - a);
                kolejka.remove();
            } else if ((char) kolejka.peek() == '*') {
                wynik.push(Integer.parseInt(String.valueOf(wynik.pop())) * Integer.parseInt(String.valueOf(wynik.pop())));
                kolejka.remove();
            } else if ((char) kolejka.peek() == '/') {
                int a = Integer.parseInt(String.valueOf(wynik.pop()));
                int b = Integer.parseInt(String.valueOf(wynik.pop()));
                wynik.push(b / a);
                kolejka.remove();
            } else {
                wynik.push(kolejka.remove());
            }
        }
        return wynik;

    }

    public void wypisz() {
        int i;
        while (!kolejka2.isEmpty()) {
            System.out.print(kolejka2.getFirst() + " ");
            kolejka2.removeFirst();
        }


    }
}
