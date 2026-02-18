package ExerciciosUnidade02;

import java.util.ArrayList;
import java.util.List;

public class Ex03 {

    // Implemente uma função que receba duas ArrayLists e retorne uma nova lista que contenha todos os elementos das listas originais intercalados.
    public static void main(String[] args) {
        List<Integer> primeiraLista = new ArrayList<>();
        primeiraLista.add(1);
        primeiraLista.add(3);
        primeiraLista.add(5);
        primeiraLista.add(7);
        List<Integer> segundaLista = new ArrayList<>();
        segundaLista.add(2);
        segundaLista.add(4);
        segundaLista.add(6);
        segundaLista.add(8);
        segundaLista.add(10);

        System.out.println(intercalarListas(primeiraLista, segundaLista));

    }

    public static List<Integer> intercalarListas(List<Integer> primeiraLista, List<Integer> segundaLista) {
        List<Integer> novaLista = new ArrayList<>();
        int tamanhoPrimeiraLista = primeiraLista.size();
        int tamanhoSegundaLista = segundaLista.size();
        int tamanhoTotal = Math.max(tamanhoPrimeiraLista, tamanhoSegundaLista);
        for (int i = 0; i < tamanhoTotal; i++) {
            if (i < tamanhoPrimeiraLista) {
                novaLista.add(primeiraLista.get(i));
            }
            if (i < tamanhoSegundaLista) {
                novaLista.add(segundaLista.get(i));
            }
        }
        
        return novaLista;
    }
}
