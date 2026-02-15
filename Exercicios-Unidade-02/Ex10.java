public class Ex10 {
    //Escolha um algoritmo de ordenação (ex: Bubble Sort, Quick Sort, Merge Sort) e implemente-o para ordenar um ArrayList de números inteiros de forma decrescente.

    public static void main(String[] args) {
        int[] arr = {2, 11, 10, 1, 22, 17, 42};

        System.out.print("Desordenado:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        bubbleSort(arr, false);
        System.out.print("\nOrdenado de forma crescente:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        bubbleSort(arr, true);

        System.out.print("\nOrdenado de forma descrescente:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    public static void bubbleSort(int[] arr, boolean reverse) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                // para forma crescente -> if (arr[j] > arr[j+1])
                if (reverse) {
                    if (arr[j] < arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        swap = true;
                    }
                } else {
                    if (arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        swap = true;
                    }
                }
            }
            if (!swap) break;
        }
    }
}
