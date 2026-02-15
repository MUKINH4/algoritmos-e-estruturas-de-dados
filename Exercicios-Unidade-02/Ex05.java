import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Ex05 {
    //Implemente um método para inverter a ordem dos elementos em um ArrayList utilizando uma pilha.
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(42);
        lista.add(5);
        lista.add(19);
        lista.add(32);
        System.out.println("Lista antes: " + lista);
        inverteArray(lista);
        System.out.println("Lista depois: " + lista);
    }

    public static void inverteArray(List<Integer> lista) {
        Stack<Integer> pilha = new Stack<>();

        for (Integer numero : lista) {
            pilha.push(numero);    
        }

        for (int i = 0; i < lista.size(); i++) {
            lista.set(i, pilha.pop());
        }
    }

}
