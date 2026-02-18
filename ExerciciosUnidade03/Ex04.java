package ExerciciosUnidade03;

public class Ex04 {
    // Implemente um algoritmo de busca binária para encontrar um elemento específico em um array ordenado de inteiros. Retorne a posição do número ou -1 se não for encontrado.

    static int buscaBinaria(int[] arr, int alvo) {
        int inicio = 0;
        int fim = arr.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;
            if (arr[meio] == alvo) {
                return meio;
            }

            if (arr[meio] < alvo) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }            
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int elementoBuscado = 3;

        int resultado = buscaBinaria(array, elementoBuscado);

        if (resultado != -1) {
            System.out.println("Elemento encontrado no índice: " + resultado );
        } else {
            System.out.println("Elemento não encontrado!");
        }
    }
}
