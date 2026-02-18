package ArvoreBinaria;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        this.key = item;
        this.left = right = null;
    }
} 
public class BinarySearchTree {
    
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    void inOrderTraversal() {
        inOrderTraversalRec(root);
    }

    void inOrderTraversalRec(Node root) {
        if (root != null) {
            inOrderTraversalRec(root.left);
            System.out.print(root.key + " ");
            inOrderTraversalRec(root.right);
        }
    }

    boolean search(int key){
        return searchRec(root, key);
    }

    boolean searchRec(Node root, int key) {
        if (root == null) return false;

        if (root.key == key) return true;

        if (key < root.key) 
            return searchRec(root.left, key);
        else 
            return searchRec(root.right, key);
    }

    void insert(int key) {
        root = insertRec(root, key);
    }
    
    public static void main(String[] args) {
        BinarySearchTree arvore = new BinarySearchTree();
        
        arvore.insert(20);
        arvore.insert(30);
        arvore.insert(10);
        arvore.insert(50);

        System.out.println("Árvore Ordenada: ");
        arvore.inOrderTraversal();
    }

}
