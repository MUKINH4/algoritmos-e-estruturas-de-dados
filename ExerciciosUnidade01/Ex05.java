package ExerciciosUnidade01;

public class Ex05 {
    public static void main(String[] args) {
        // Crie uma matriz (array) de números inteiros. Encontre e imprima o maior valor na matriz.

        int[][] matriz = {
            {1, 2, 10},
            {2, 41, 0},
            {32, 23, 15}
        };

        int max = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (max < matriz[i][j]) {
                    max = matriz[i][j];
                }
            }
        }

        System.out.println("Maior valor: " + max);

    }
}
