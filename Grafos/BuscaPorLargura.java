package Grafos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BuscaPorLargura {
    
    private Map<String, List<Aresta>> adjacencias;

    public BuscaPorLargura() {
        adjacencias = new HashMap<>();
    }

    public Map<String, Boolean> buscaPorLargura(String verticeInicial) {
        Map<String, Boolean> visitados = new HashMap<>();
        Queue<String> fila = new LinkedList<>();

        for (String vertice : adjacencias.keySet()) {
            visitados.put(vertice, false);
        }

        fila.add(verticeInicial);
        visitados.put(verticeInicial, true);

        while (!fila.isEmpty()) {
            String verticeAtual = fila.poll();
            System.out.print(verticeAtual + " ");

            List<Aresta> vizinhos = adjacencias.get(verticeAtual);

            for (Aresta aresta : vizinhos) {
                if (!visitados.get(aresta.getDestino())) {
                    fila.add(aresta.getDestino());
                    visitados.put(aresta.getDestino(), true);
                }
            }
        }


        return visitados;
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
        BuscaPorLargura grafo = new BuscaPorLargura();

        grafo.adicionarVertice("Brasil");
        grafo.adicionarVertice("Estados Unidos");
        grafo.adicionarVertice("Alemanha");
        grafo.adicionarVertice("Inglaterra");
        grafo.adicionarVertice("Irlanda");

        grafo.adicionarAresta("Brasil", "Alemanha", 10);
        grafo.adicionarAresta("Brasil", "Japão", 2);
        grafo.adicionarAresta("Irlanda", "Brasil", 7);
        grafo.adicionarAresta("Estados Unidos", "Inglaterra", 5);

        grafo.buscaPorLargura("Brasil");

        
    }

}

