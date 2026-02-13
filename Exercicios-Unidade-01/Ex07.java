import java.util.Scanner;

public class Ex07 {
    // Implemente um jogo da velha (Tic-Tac-Toe) usando uma matriz para representar o tabuleiro. Permita que dois jogadores façam jogadas alternadas.

    public static void main(String[] args) {
        char[][] tabuleiro = new char[3][3];
        boolean jogoAtivo = true;
        char vezJogador = 'X';
        inicializarTabuleiro(tabuleiro);

        while(jogoAtivo) {

            
            exibirTabuleiro(tabuleiro);
            realizarJogada(tabuleiro, vezJogador);
            if (verificarVitoria(tabuleiro, vezJogador)) {
                exibirTabuleiro(tabuleiro);
                System.out.println("Jogador " + vezJogador + " venceu!");
                jogoAtivo = false;
            } else if (verificaEmpate(tabuleiro)) {
                System.out.println("O jogo terminou em empate. Recomeçando!");
                inicializarTabuleiro(tabuleiro);
            } 
            else {
                vezJogador = (vezJogador == 'X') ? 'O' : 'X';
            }

        }

        exibirTabuleiro(tabuleiro);

    }

    public static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println("\n-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public static void realizarJogada(char[][] tabuleiro, char jogador) {
        Scanner scanner = new Scanner(System.in);
        boolean jogadaValida = false;

        while (!jogadaValida) {
            System.out.print("Jogador " + jogador + " - escolha a linha (0-2): ");
            int linha = scanner.nextInt();
            System.out.print("Jogador " + jogador + " - escolha a coluna (0-2): ");
            int coluna = scanner.nextInt();

            if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
                tabuleiro[linha][coluna] = jogador;
                jogadaValida = true;
            } else {
                System.out.println("Jogada inválida!");
            }   
        }
    }

    public static void inicializarTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }
    
    public static boolean verificarVitoria(char[][] tabuleiro, char jogador) {
        // Linhas e Colunas
        for (int i = 0; i < 3; i++) {
            if ((jogador == tabuleiro[i][0] && jogador == tabuleiro[i][1] && jogador == tabuleiro[i][2]) || 
                (jogador == tabuleiro[0][i] && jogador == tabuleiro[1][i] && jogador == tabuleiro[2][i])) {
                    return true;
            }
        }
        // Diagonais
        if ((jogador == tabuleiro[0][0] && jogador == tabuleiro[1][1] && jogador == tabuleiro[2][2]) || 
            (jogador == tabuleiro[0][2] && jogador == tabuleiro[1][1] && jogador == tabuleiro[2][0])) {
            return true;
        }

        return false;
    }

    public static boolean verificaEmpate(char[][] tabuleiro) {
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
                
            }
        }
        return true;
    }

}
