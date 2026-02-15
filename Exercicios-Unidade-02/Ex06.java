import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex06 {
    // Crie um sistema simples de fila de espera com funcionalidades de adicionar, remover e exibir elementos.

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar pessoa à fila de espera");
            System.out.println("2 - Chamar próxima pessoa da fila de espera");
            System.out.println("3 - Exibir fila de espera");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome da pessoa: ");
                    String nome = scanner.nextLine();
                    fila.add(nome);
                    System.out.println("\nPessoa adicionada a fila!");
                    break;
                case 2:
                    if (!fila.isEmpty()) {
                        String proximaPessoa = fila.poll();
                        System.out.println("\nA próxima pessoa é: " + proximaPessoa);
                        break;
                    }
                    System.out.println("\nFila vazia");
                    break;
                case 3:
                    if (!fila.isEmpty()) {
                        System.out.println("\nFila atual: " + fila);
                        break;
                    }        
                    System.out.println("\nFila vazia");
                    break;
                case 4:
                    scanner.close();
                    continuar = false;
                    break;
                default:
                    break;
            }
        }
    }
}
