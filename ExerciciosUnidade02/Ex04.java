package ExerciciosUnidade02;

import java.util.Stack;

public class Ex04 {
    // Utilizando pilhas, desenvolva um programa para verificar se uma expressão matemática contendo parênteses está balanceada.

    public static void main(String[] args) {
        String expressao1 = "(a + b) * (c - d)"; 
        String expressao2 = "((a + b) * (c - d)"; 
        String expressao3 = ")(a + b)("; 
        String expressao4 = "a + b - c * d";

        System.out.println("A expressão 1 está balanceada? " + verificarBalanceamento(expressao1));
        System.out.println("A expressão 2 está balanceada? " + verificarBalanceamento(expressao2));
        System.out.println("A expressão 3 está balanceada? " + verificarBalanceamento(expressao3));
        System.out.println("A expressão 4 está balanceada? " + verificarBalanceamento(expressao4));
    }

    public static boolean verificarBalanceamento(String expressao) {
        Stack<Character> pilha = new Stack<>();

        // percorre por todos os caracteres da expressao
        for (int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);
            // se o caractere for igual a abre parenteses joga ele para a pilha
            if (c == '(') {
                pilha.push(c);
                // procura o fechamento desse abre parenteses
            } else if (c == ')') {
                // Quando encontra um ), o programa verifica se a pilha esta vazia ou se o topo nao eh um (.
                // Se a pilha estiver vazia, significa que apareceu um ) sem ter aberto antes.
                // Se o topo não for (, significa que a ordem esta errada.
                // Em qualquer um desses casos, a expressão esta desbalanceada entao retorna falso.
                if (pilha.isEmpty() || pilha.peek() != '(') {
                    return false;
                } else {
                    //se nao remove o caracter da pilha
                    pilha.pop();
                }
            }
        }
        // se a pilha estiver vazia quer dizer que a expressao esta balanceada
        return pilha.isEmpty();
    }
}
