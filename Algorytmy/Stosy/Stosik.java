package Stosy;

public class Stosik<E> {

    private int numNodes = 0;
    private Node head;

    public Stosik(E element) {
        head = new Node(element);
        numNodes++;
    }

    public void push(E element) {
        Node temp = head;
        if (numNodes == 0) {
            Node doDodania = new Node(element);
            head = doDodania;
            numNodes++;
            return;

        }

        while (temp.next != null) {
            temp = temp.next;
        }
        Node doDodania = new Node(element);
        temp.next = doDodania;
        numNodes++;
    }

    public void pop() {
        int liczba = 1;
        Node temp = head;
        Node temp2 = head;
        if (numNodes == 1) {
            head = null;
            numNodes--;
            return;
        }

        while (temp.next != null) {
            if (liczba == numNodes - 1) {
                temp2 = temp;
            }
            temp = temp.next;
            liczba++;
        }
        temp2.next = null;
        numNodes--;
    }


    public int getSize() {
        return numNodes;
    }

    public void print() {
        Node temp = head;
        if (numNodes >= 1) {
            System.out.print(temp.getElement() + " ");
            while (temp.next != null) {
                temp = temp.next;
                System.out.print(temp.getElement() + " ");

            }
            System.out.println();
        } else {
            System.out.println("nie ma elemenow");
        }
    }
}
