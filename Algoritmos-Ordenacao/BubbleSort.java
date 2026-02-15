public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if (!swap) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 10, 51, 22, 15};

        System.out.print("Lista não ordenada: ");
        for (int item : arr) {
            System.out.print(" " + item);
        }
        bubbleSort(arr);

        System.out.print("\nLista ordenada: ");
        for (int item : arr) {
            System.out.print(" " + item);
        }
    }
}
