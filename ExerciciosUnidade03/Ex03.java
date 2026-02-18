package ExerciciosUnidade03;

public class Ex03 {
    static int buscaLinear(int[] arr, int alvo) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == alvo) {
                return i;
            }
        }
        return -1;
    }
    // Escreva um método que realize uma busca linear em um array de inteiros para encontrar um número específico e retorne a posição do número ou -1 se não for encontrado.


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int encontrado = buscaLinear(array, 10);
        if (encontrado != -1) {
            System.out.println("Posição do número procurado: " + encontrado);
        } else {
            System.out.println("Número não encontrado");
        }
    }
}
