package ExerciciosUnidade03;

class Node {
    int key;
    Node left, right;

    public Node(int key) {
        this.key = key;
        left = right = null;
    }

}

public class Ex02 {
    // Escreva um método para verificar se uma árvore binária é uma árvore binária de busca (BST).

    private Node root;

    public Ex02() {
        this.root = null;
    }

    boolean verificaBST() {
        return verificaBSTRec(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean verificaBSTRec(Node root, int valorMin, int valorMax) {
        if (root == null) {
            return true;
        }

        if (root.key < valorMin || root.key > valorMax) {
            return false;
        }

        return (verificaBSTRec(root.left, valorMin, root.key - 1) && 
                verificaBSTRec(root.right, root.key + 1, valorMax));
    }

    void criarArvoreInvalida() {
        root = new Node(20);
        root.left = new Node(10);
        root.right = new Node(30);
        root.right.left = new Node(5);
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
        Ex02 arvore = new Ex02();
        
        arvore.insert(20);
        arvore.insert(30);
        arvore.insert(10);
        arvore.insert(50);

        System.out.println("Árvore válida: " + arvore.verificaBST());

        // Teste inválido
        Ex02 arvoreInvalida = new Ex02();
        arvoreInvalida.criarArvoreInvalida();

        System.out.println("Árvore inválida: " + arvoreInvalida.verificaBST());
        }
}
