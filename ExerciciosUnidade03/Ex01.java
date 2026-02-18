package ExerciciosUnidade03;


class Node {
    int key;
    Node left, right;

    public Node(int key) {
        this.key = key;
        left = right = null;
    }
}
public class Ex01 {

    // Crie uma classe em Java para representar uma árvore binária e implemente métodos para inserir elementos, percorrer a árvore em pré-ordem, pós-ordem e em ordem.
    Node root;

    public Ex01() {
        root = null;
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

    void preOrderTraversal() {
        preOrderTraversalRec(root);
    }

    void preOrderTraversalRec(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preOrderTraversalRec(root.left);
            preOrderTraversalRec(root.right);
        }
    }

    void posOrderTraversal() {
        posOrderTraversalRec(root);
    }

    void posOrderTraversalRec(Node root) {
        if (root != null) {
            posOrderTraversalRec(root.left);
            posOrderTraversalRec(root.right);
            System.out.print(root.key + " ");
        }
    }

    void insert(int key){
        root = insertRec(key, root);
    }

    Node insertRec(int key, Node root) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(key, root.left);
        } else if (key > root.key) {
            root.right = insertRec(key, root.right);
        }

        return root;
    }

    public static void main(String[] args) {
        Ex01 arvore = new Ex01();

        arvore.insert(20);
        arvore.insert(150);
        arvore.insert(30);
        arvore.insert(10);
        arvore.insert(50);

        System.out.print("Árvore Ordenada (Em Ordem): ");
        arvore.inOrderTraversal();
        System.out.print("\nÁrvore Ordenada (Pré Ordem): ");
        arvore.preOrderTraversal();
        System.out.print("\nÁrvore Ordenada (Pós Ordem): ");
        arvore.posOrderTraversal();
    }
}
