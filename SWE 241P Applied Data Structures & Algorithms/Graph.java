import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Stack;
import java.io.DataInput;
import java.io.IOException;


public class Graph {

    private static final String NEWLINE = System.getProperty("line.separator");

    private final int V;
    private int E;
    public LinkedList<Integer>[] adj;


    //constructor that helps build the graph from a linkedlist integer array
    @SuppressWarnings("unchecked")
    public Graph(int V) {
        if (V < 0) throw new IllegalArgumentException("Number of vertices must be non-negative");
        this.V = V;
        this.E = 0;
        adj = (LinkedList<Integer>[]) new LinkedList[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new LinkedList<Integer>();
        }
    }


    @SuppressWarnings("unchecked")
    public Graph(DataInput in) throws IOException {
        if (in == null) throw new IllegalArgumentException("argument is null");
        try {
            this.V = in.readInt();
            if (V < 0) throw new IllegalArgumentException("number of vertices in a Graph must be non-negative");
            adj = (LinkedList<Integer>[]) new LinkedList[V];
            for (int v = 0; v < V; v++) {
                adj[v] = new LinkedList<Integer>();
            }
            int E = in.readInt();
            if (E < 0) throw new IllegalArgumentException("number of edges in a Graph must be non-negative");
            for (int i = 0; i < E; i++) {
                int v = in.readInt();
                int w = in.readInt();
                validateVertex(v);
                validateVertex(w);
                addEdge(v, w);
            }
        }
        catch (NoSuchElementException e) {
            throw new IllegalArgumentException("invalid input format in Graph constructor", e);
        }
    }




    @SuppressWarnings("unchecked")
    public Graph(Graph G) {
        this.V = G.V();
        this.E = G.E();
        if (V < 0) throw new IllegalArgumentException("Number of vertices must be non-negative");

        // update adjacency lists
        adj = (LinkedList<Integer>[]) new LinkedList[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new LinkedList<Integer>();
        }

        for (int v = 0; v < G.V(); v++) {
            // reverse so that adjacency list is in same order as original
            Stack<Integer> reverse = new Stack<Integer>();
            for (int w : G.adj[v]) {
                reverse.push(w);
            }
            for (int w : reverse) {
                adj[v].add(w);
            }
        }
    }

    //returns the number of vertices in the graph.
    public int V() {
        return V;
    }

    //returns the number of edges in the graph.
    public int E() {
        return E;
    }

    // throw an IllegalArgumentException unless {@code 0 <= v < V}
    private void validateVertex(int v) {
        if (v < 0 || v >= V)
            throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (V-1));
    }

    //adds an edge to the graph
    public void addEdge(int v, int w) {
        if(!adj[v].contains(w)) {
            adj[v].add(w);
        }

        if(!adj[w].contains(v)) {
            adj[w].add(v);

        }

        E++;

    }


    //returns the vertices next to the vertex.
    public Iterable<Integer> adj(int v) {
        validateVertex(v);
        return adj[v];
    }

    //returns the degree of the vertex
    public int degree(int v) {
        validateVertex(v);
        return adj[v].size();
    }


    //builds out the graph into a string
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(V + " vertices, " + E + " edges " + NEWLINE);
        for (int v = 0; v < V; v++) {
            s.append(v + ": ");
            for (int w : adj[v]) {
                s.append(w + " ");
            }
            s.append(NEWLINE);
        }
        return s.toString();
    }
}