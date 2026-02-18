package ExerciciosUnidade03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Grafo {
    
    Map<Integer, List<Integer>> adj;

    public Grafo() {
        adj = new HashMap<>();
    }

    public void adicionarVertice(int vertices) {
        adj.put(vertices, new ArrayList<>());
    }

    public void adicionarAresta(int origem, int destino) {
        adj.get(origem).add(destino);
        adj.get(destino).add(origem);
    }

    public List<Integer> obterVizinhos(int vertices) {
        return adj.get(vertices);
    }
}

public class Ex05 {
    // Crie uma classe que represente um grafo em Java utilizando lista de adjacências ou matriz de adjacências.

    public static void main(String[] args) {
        Grafo grafo = new Grafo();
    
        grafo.adicionarVertice(1);
        grafo.adicionarVertice(2);
        grafo.adicionarVertice(3);
        grafo.adicionarVertice(4);
    
        grafo.adicionarAresta(1, 2);
        grafo.adicionarAresta(1, 3);
        grafo.adicionarAresta(2, 3);
        grafo.adicionarAresta(3, 4);
    
        System.out.println("Vizinhos do vértice 1: " + grafo.obterVizinhos(1));
        System.out.println("Vizinhos do vértice 2: " + grafo.obterVizinhos(2));
        System.out.println("Vizinhos do vértice 3: " + grafo.obterVizinhos(3));
        System.out.println("Vizinhos do vértice 4: " + grafo.obterVizinhos(4));
        
    }

}
