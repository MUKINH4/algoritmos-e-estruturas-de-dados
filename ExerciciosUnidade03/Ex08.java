package ExerciciosUnidade03;

public class Ex08 {
    // Escreva um método para encontrar o menor valor em uma árvore binária de busca.

    static class Node {
    int valor;
    Node esquerda, direita;

        public Node(int valor) {
            this.valor = valor;
            esquerda = direita = null;
        }
    }
    private Node raiz;

    public Ex08() {
        raiz = null;
    }

    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private Node inserirRecursivo(Node node, int valor) {
        if (node == null) {
            return new Node(valor);
        }

        if (valor < node.valor) {
            node.esquerda = inserirRecursivo(node.esquerda, valor);
        } else if (valor > node.valor) {
            node.direita = inserirRecursivo(node.direita, valor);
        }

        return node;
    }

    public int encontrarMenorValor() {
        return encontrarMenorValorRecursivo(raiz);
    }

    private int encontrarMenorValorRecursivo(Node node) {
        if (node.esquerda == null) {
            return node.valor;
        }

        return encontrarMenorValorRecursivo(node.esquerda);
    }

    public static void main(String[] args) {
        Ex08 arvore = new Ex08();
        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(15);
        arvore.inserir(1);
        arvore.inserir(0);
        arvore.inserir(8);

        int menorValor = arvore.encontrarMenorValor();
        System.out.println("O menor valor na árvore é: " + menorValor);
    }
}
