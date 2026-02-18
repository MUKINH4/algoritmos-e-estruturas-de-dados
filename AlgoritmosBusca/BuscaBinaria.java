public class BuscaBinaria {

    public static int buscaBinaria(int[] array, int elemento) {
        int inicio = 0;
        int fim = array.length - 1;
        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;
            if (array[meio] == elemento) {
                return meio;
            }

            if (array[meio] < elemento) {
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
