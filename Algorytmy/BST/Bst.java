package BST;

import java.util.ArrayDeque;

public class Bst {
    int numNodes;
    Node root;
    ArrayDeque stosik = new ArrayDeque();

    public Bst(int element) {
        root = new Node(element);
        numNodes++;
    }

    public Bst(Node root) {
        this.root = root;
        numNodes++;
    }

    public Node add(int element, Node current) {
        if (current == null) {
            numNodes++;
            return new Node(element);
        }
        if (element >= current.value) {
            current.right = add(element, current.right);
        } else {
            current.left = add(element, current.left);
        }
        return current;
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.value + " ");
            inorder(root.right);
        }
    }


    public int ilosc() {
        return numNodes;
    }

    public boolean wyszukaj(int element, Node current) {
        while (current != null) {
            if (current.value == element) {
                return true;
            } else if (element >= current.value) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return false;
    }


    public Node delete(Node root, int element) {
        if (root == null) return root;
        if (element < root.value)
            root.left = delete(root.left, element);
        else if (element > root.value)
            root.right = delete(root.right, element);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.value = min(root.right);
            root.right = delete(root.right, root.value);
        }
        return root;
    }

    public int min(Node root) {
        int min = root.value;
        while (root.left != null) {
            min = root.left.value;
            root = root.left;
        }
        return min;
    }

    public boolean czykopiec(int[] tablica) {
        for (int i = 0; i <= tablica.length / 2 - 1; i++) {
            if (tablica.length % 2 == 1) {
                if (tablica[i] < tablica[2 * i + 1] || tablica[i] < tablica[2 * i + 2]) {
                    return false;
                }
            } else {
                if ( tablica[i] < tablica[2 * i + 1])
                {
                    return false;
                }
            }}
            return true;

    }
}