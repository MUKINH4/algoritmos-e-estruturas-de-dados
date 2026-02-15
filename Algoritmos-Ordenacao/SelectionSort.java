public class SelectionSort {
    
    public static void selectionSort(int[] arr) {

        // pega o tamanho da lista
        int tamanho = arr.length;

        // percorre a lista toda
        for (int i = 0; i < tamanho; i++) {
            // guarda a variavel o index atual para o minIndex
            int minIndex = i;
            // percorre novamente a lista porem pegando o proximo index
            for (int j = i + 1; j < tamanho; j++) {
                // compara se o valor do proximo index eh menor que o index atual/menor
                if (arr[j] < arr[minIndex]) {
                    // se for menor armazena o menor valor (j) na variavel minIndex 
                    minIndex = j;
                }
            }
            // faz o swap
            int temp = arr[minIndex]; // temp = menor valor
            arr[minIndex] = arr[i]; // menor valor = indice atual
            arr[i] = temp; // indice atual = menor valor
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 10, 51, 22, 15};

        System.out.print("Lista não ordenada: ");
        for (int item : arr) {
            System.out.print(" " + item);
        }
        selectionSort(arr);

        System.out.print("\nLista ordenada: ");
        for (int item : arr) {
            System.out.print(" " + item);
        }
    }

}
