package ExerciciosUnidade01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {
    
    public static void main(String[] args) {
        // Implemente um programa que permita ao usuário adicionar e remover elementos de uma lista dinâmica (por exemplo, ArrayList) de números inteiros.
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nEscolha uma Opção: ");
            System.out.println("1 - Mostrar lista");
            System.out.println("2 - Adicionar um item");
            System.out.println("3 - Remover um item");
            System.out.println("4 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    if (lista.isEmpty()) {
                        System.out.println("Lista vazia!");
                        break;
                    }
                    System.out.println(lista);
                    break;
                case 2:
                    System.out.print("Escolha um número para adicionar: ");
                    int numero = scanner.nextInt();
                    lista.add(numero);
                    System.out.println("Número adicionado!");
                    break;
                case 3:
                    if (lista.isEmpty()) {
                        System.out.println("Lista vazia, nada para remover!");
                        break;
                    }
                    System.out.print("Digite o índice do número que deseja remover: ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < lista.size()) {
                        lista.remove(indice);
                        System.out.println("Número removido com sucesso!");
                    } else {
                        System.out.println("Índice inválido tente novamente!");
                    }
                    break;
                case 4:
                    System.out.println("Até a próxima!");
                    scanner.close();
                    break;
                default: 
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 4);

    }

}
