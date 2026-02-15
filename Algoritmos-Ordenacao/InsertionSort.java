public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int tamanho = arr.length;

        for (int i = 1; i < tamanho; i++) {
            // temp = 1
            int temp = arr[i];
            // j = 0
            int j = i - 1;

            // while ( 0 >= 0 && 2 > 1)
            // 0 + 1 = 2
            // -1
            while (j >= 0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j--;
            }
            
            // 0 = 1
            arr[j+1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 10, 51, 22, 15};

        System.out.print("Lista não ordenada: ");
        for (int item : arr) {
            System.out.print(" " + item);
        }

        insertionSort(arr);

        System.out.print("\nLista ordenada: ");
        for (int item : arr) {
            System.out.print(" " + item);
        }
    }
}
