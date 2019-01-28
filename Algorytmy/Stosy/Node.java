package Stosy;

public class Node<E> {
    private E element;
    Node next;

    public Node(E element) {
        this.element = element;
    }


    public E getElement() {
        return element;
    }
}
