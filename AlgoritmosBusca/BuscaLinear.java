public class BuscaLinear {

    static int buscaLinear(int[] array, int elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento) {
                return i;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int[] array = {5, 22, 20, 10, 2, 3, 7, 22, 42};

        int elementoBuscado = 42;

        int resultado = buscaLinear(array, elementoBuscado);

        if (resultado != -1) {
            System.out.println("Índice do elemento buscado: " + resultado);
        } else 
            System.out.println("Elemento não encontrado!");
    }
}
