import java.util.LinkedList;
import java.util.Queue;

public class Ex07 {
    // Crie um programa para simular a ordem de chegada de elementos em uma fila e exiba a ordem de saída.

    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();

        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.add(4);
        fila.add(5);
        fila.add(6);

        System.out.println("Fila na ordem de chegada: " + fila);

        System.out.print("Fila na ordem de saída:");
        while (!fila.isEmpty()) {
            System.out.print(" " + fila.poll());
        }
    }
}
