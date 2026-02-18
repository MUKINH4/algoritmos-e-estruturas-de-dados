package Grafos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BuscaPorProfundidade {
    
    private Map<String, List<Aresta>> adjacencias;

    public BuscaPorProfundidade() {
        adjacencias = new HashMap<>();
    }

    public Map<String, Boolean> buscaPorProfundidade(String verticeInicial) {
        Map<String, Boolean> visitados = new HashMap<>();

        for (String vertice : adjacencias.keySet()) {
            visitados.put(vertice, false);
        }

        dfs(verticeInicial, visitados);

        return visitados;
    }

    public void dfs(String vertice, Map<String, Boolean> visitados) {
        visitados.put(vertice, true);
        System.out.print(" " + vertice);

        List<Aresta> vizinhos = adjacencias.get(vertice);
        for (Aresta aresta : vizinhos) {
            if (!visitados.containsKey(aresta.getDestino())) {
                dfs(aresta.getDestino(), visitados);
            }
        }
    }


    public void adicionarVertice(String label) {
        adjacencias.put(label, new ArrayList<>());
    }

    public void imprimirGrafo() {
        for (String vertice : adjacencias.keySet()) {
            List<Aresta> arestas = adjacencias.get(vertice);
            System.out.print(vertice + " -> ");
            for (Aresta aresta : arestas) {
                System.out.print(aresta.getDestino() + "(" + aresta.getPeso() + ") ");
            }
            System.out.println();
        }
    }

    public void adicionarAresta(String origem, String destino, int peso) {
        if (!adjacencias.containsKey(origem)) {
            adicionarVertice(origem);
        }
        if (!adjacencias.containsKey(destino)) {
            adicionarVertice(destino);
        }

        adjacencias.get(origem).add(new Aresta(destino, peso));
    }
 
    private class Aresta {
        private String destino;
        private int peso;

        public Aresta(String destino, int peso) {
            this.destino = destino;
            this.peso = peso;
        }

        public String getDestino() {
            return destino;
        }

        public int getPeso() {
            return peso;
        }
    }
    public static void main(String[] args) {
        BuscaPorProfundidade grafo = new BuscaPorProfundidade();

        grafo.adicionarVertice("Brasil");
        grafo.adicionarVertice("Estados Unidos");
        grafo.adicionarVertice("Alemanha");
        grafo.adicionarVertice("Inglaterra");
        grafo.adicionarVertice("Irlanda");

        grafo.adicionarAresta("Brasil", "Alemanha", 10);
        grafo.adicionarAresta("Brasil", "Japão", 2);
        grafo.adicionarAresta("Irlanda", "Brasil", 7);
        grafo.adicionarAresta("Estados Unidos", "Inglaterra", 5);

        grafo.buscaPorProfundidade("Brasil");

        
    }

}

