package sistemasoperativos.timequatum;

import java.util.*;

class Grafo {
    private int V;
    private LinkedList<Integer> adj[];

    Grafo(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList<>();
    }

    void agregarArista(int v, int w) {
        adj[v].add(w);
    }

    void busqueda(int s) {
        boolean visitados[] = new boolean[V];

        LinkedList<Integer> cola = new LinkedList<>();

        visitados[s] = true;
        cola.add(s);

        while (cola.size() != 0) {
            s = cola.poll();
            System.out.print(s + " ");

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visitados[n]) {
                    visitados[n] = true;
                    cola.add(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        Grafo g = new Grafo(4);
        g.agregarArista(0, 1);
        g.agregarArista(0, 2);
        g.agregarArista(1, 2);
        g.agregarArista(2, 0);
        g.agregarArista(2, 3);
        g.agregarArista(3, 3);

        System.out.println("Recorrido busqueda comenzando desde el nodo 2:");
        g.busqueda(1);
    }
}
