public class Kolejka<E>{

    private int numNodes = 0;
    private Node head;

    public Kolejka(E element) {
        head = new Node(element);
        numNodes++;
    }

    public void Enqueue(E element) {
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

    public  void Dequeue(){
        if(numNodes==0){
            throw new IndexOutOfBoundsException(" Size " + numNodes);
        }else
        if (numNodes == 1) {
            head = null;
            numNodes--;
            return;
        }
        Node temp = head;
        temp=temp.next;
        head=temp;
            numNodes--;
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
