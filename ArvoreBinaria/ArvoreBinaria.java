package ArvoreBinaria;

public class ArvoreBinaria {
    
    Node root;

    public ArvoreBinaria() {
        this.root = null;
    }

    static class Node {
        String nome;
        Node left;
        Node right;

        public Node(String nome) {
            this.nome = nome;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.root = new Node("Root");
    }

}
