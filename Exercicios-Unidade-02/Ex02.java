import java.util.ArrayList;
import java.util.List;

public class Ex02 {
    // Crie um método para remover elementos duplicados de um ArrayList.
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(1);
        lista.add(3);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        System.out.print("Lista antes: ");
        System.out.println(lista);
        
        removerDuplicados(lista);
        
        System.out.print("Lista sem duplicatas: ");
        System.out.println(lista);
    }

    public static void removerDuplicados(List<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(i).equals(lista.get(j))) {
                    lista.remove(j);
                    j--;
                }
            }
        }
    }
}
