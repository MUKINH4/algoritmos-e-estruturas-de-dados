package ExerciciosUnidade02;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {

    // Escreva um programa para inverter os elementos de um ArrayList sem usar métodos prontos do java.
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        lista.add(2);
        lista.add(42);
        lista.add(5);
        lista.add(19);
        lista.add(32);

        System.out.print("Lista antes:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(" " + lista.get(i));
        }
        
        System.out.print("\nLista invertida:");
        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.print(" " + lista.get(i));
        }
    }
}
