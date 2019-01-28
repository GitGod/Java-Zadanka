package BST;

public class Main {
    public static void main(String[] args) {

        int[] y = {15, 14, 5, 13,8};
        Bst k1 = new Bst(y[0]);
        for (int i = 1; i < y.length; i++) {
            k1.add(y[i],k1.root);
        }
        k1.inorder(k1.root);
        System.out.println();
        System.out.println(k1.ilosc());
        System.out.println(k1.wyszukaj(3,k1.root));
        k1.delete(k1.root,13);
        k1.inorder(k1.root);
        System.out.println();
        System.out.println("Czy dana tablica moze byc kopcem? " + k1.czykopiec(y));

    }
}
