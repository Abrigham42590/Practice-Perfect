import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.io.BufferedReader;
import java.util.ArrayList;

public class city {
    public HashMap<String, Integer> mapping2;  // string -> index
    private String[] keys;// index  -> string
    private Graph graph;
    public Integer[] populationamount;
    public ArrayList<String> Name = new ArrayList<String>();
    public ArrayList<Integer> listofpopulation = new ArrayList<Integer>();
    public int sum = 0;
    public int sum2;
    // the underlying graph


    //Initializes the constructor city.
    public city() throws IOException {
        mapping2 = new HashMap<String, Integer>();

        // First pass builds the index by reading strings to associate
        // distinct strings with an index
        // while (in.hasNextLine()) {

        File file = new File("C:\\Coding Assignments\\road_network2.txt");
        BufferedReader br1 = new BufferedReader(new FileReader(file));
        String read;

        while ((read = br1.readLine()) != null) {
            String[] a = read.split(" : ");
            for (int i = 0; i < a.length; i++) {
                if (!mapping2.containsKey(a[i]))
                    mapping2.put(a[i], mapping2.size());
            }
        }

        // inverted index to get string keys in an array
        keys = new String[mapping2.size()];
        for (String name : mapping2.keySet()) {
            keys[mapping2.get(name)] = name;
        }

        // second pass builds the graph by connecting first vertex on each
        // line to all others


        graph = new Graph(mapping2.size());
        while ((read = br1.readLine()) != null) {
            String[] a = read.split(" : ");
            int v = mapping2.get(a[0]);
            for (int i = 1; i < a.length; i++) {
                int w = mapping2.get(a[i]);
                graph.addEdge(v, w);
            }
        }



        if(br1 != null) {

            try {
                br1.close();
            }

            catch(Exception e) {
                System.out.print("file error");

            };

        }

    }



    //checks to see if the graph contains the vertex.
    public boolean contains(String s) {
        return mapping2.containsKey(s);
    }

    //returns the integer associated with the vertex.
    public int indexOf(String s) {
        return mapping2.get(s);
    }


    //returns the name of the vertex at a particular position.
    public String nameOf(int v) {
        validateVertex(v);
        return keys[v];
    }


    //return the symbol graph.
    public Graph graph() {
        return graph;
    }

    // throw an IllegalArgumentException unless {@code 0 <= v < V}
    private void validateVertex(int v) {
        int V = graph.V();
        if (v < 0 || v >= V)
            throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (V-1));
    }
}