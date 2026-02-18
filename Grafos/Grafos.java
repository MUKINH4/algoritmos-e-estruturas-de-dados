package Grafos;

import java.util.LinkedList;
import java.util.List;

public class Grafos {
    private int vertices;
    private List<Integer>[] adj;

    public Grafos(int vertices) {
        this.vertices = vertices;
        adj = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int primeiroVertice, int segundoVertice) {
        adj[primeiroVertice].add(segundoVertice); 
        adj[segundoVertice].add(primeiroVertice); 
    }

    public static void main(String[] args) {
        Grafos grafo = new Grafos(5);

        grafo.addEdge(0, 1);
        grafo.addEdge(2, 4);
        grafo.addEdge(0, 2);
        grafo.addEdge(0, 2);
        grafo.addEdge(0, 2);

        System.out.println(grafo.adj[2]);
    }
}
