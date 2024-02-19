import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ConnectedComponents {
    private boolean[] marked;   // marked[v] = has vertex v been marked?
    private int[] id;           // id[v] = id of connected component containing v
    private int[] size;         // size[id] = number of vertices in given component
    private int count;          // number of connected components
    private int count2;
    private int countislands;
    private int sum = 0;
    private int sum2 = 0;
    private int sum3 = 0;
    private int sum4 = 0;
    private int sum5 = 0;
    private int numberg;
    private int numberh;
    public static int population;
    public Integer[] populationamount;
    public ArrayList<String> Name = new ArrayList<String>();
    public ArrayList<String> citylist2 = new ArrayList<String>();
    public ArrayList<String> Name2 = new ArrayList<String>();
    public ArrayList<String> Name3 = new ArrayList<String>();
    public ArrayList<String> Name4 = new ArrayList<String>();
    public ArrayList<String> Name5 = new ArrayList<String>();
    public ArrayList<String> Name6 = new ArrayList<String>();
    public ArrayList<Integer> numbers = new ArrayList<Integer>();
    public ArrayList<Integer> listofpopulation = new ArrayList<Integer>();
    public ArrayList<Integer> listofpopulation2 = new ArrayList<Integer>();
    public HashMap<Integer, Integer> popmap = new HashMap<Integer, Integer>();
    public HashMap<String, Integer> popmap2 = new HashMap<String, Integer>();
    public HashSet<String>citylist = new HashSet<String>();
    public HashSet<Integer> poplist2 = new HashSet<Integer>();
    public ArrayList<Integer> poplist = new ArrayList<Integer>();


    //computes the connected components of the directed graph.

    //computes the vertices in the graph that are connected to the source.
    public void populationofisland() throws IOException {


        File file = new File("C:\\Coding Assignments\\city_population 2.txt");
        BufferedReader br1 = new BufferedReader(new FileReader(file));
        String read3;

        while((read3 = br1.readLine()) != null) {

            String[] popsplit = read3.split(" : ");

            if(popsplit.length > 1) {
                population = Integer.parseInt(popsplit[1]);
                numbers.add(population);
            }

            //citylist.add(popsplit[0]);
            popmap2.put(popsplit[0], population);


            for(int i = 0; i < popsplit.length; i++) {
                if(!popmap.containsKey(i)) {
                    popmap.put(i, population);
                }
            }

            //populationamount = new Integer[listofpopulation.size()];
            //populationamount = listofpopulation.toArray(populationamount);





        }

        if(br1 != null) {

            try {
                br1.close();
            }

            catch(Exception e) {

            };

        }


    }



    //computes the connected components of the directed graph.
    public ConnectedComponents(Graph G) throws IOException {
        city networkcheck = new city();
        marked = new boolean[G.V()];
        id = new int[G.V()];
        size = new int[G.V()];
        for (int v = 0; v < G.V(); v++) {
            //citylist.add(networkcheck.nameOf(v));
            if (!marked[v]) {
                //System.out.println(networkcheck.nameOf(v));
                dfs(G, v);
                //System.out.println(networkcheck.nameOf(v));
                citylist2.add(networkcheck.nameOf(v));
                count++;



            }
        }
    }


    // depth-first search for a Graph, that marks an element visited as true then
    //checks to see if it has been visited. If not then it recurs or begins the process again.
    private void dfs(Graph G, int v) throws IOException {
        city networkcheck = new city();

        //System.out.println(networkcheck.nameOf(v));
        if(count < 1) {
            //System.out.println(networkcheck.nameOf(v));
            if(!Name2.contains(networkcheck.nameOf(v))) {
                Name2.add(networkcheck.nameOf(v));
                //System.out.println(networkcheck.nameOf(v));
                citylist.add(networkcheck.nameOf(v));
            }

            //System.out.println(networkcheck.nameOf(v));
        }



        else if(count == 1) {
            Name3.add(networkcheck.nameOf(v));
            //System.out.println("hello");
            //System.out.println(networkcheck.nameOf(v));

        }

        else if(count == 2) {
            Name4.add(networkcheck.nameOf(v));
            //System.out.println(networkcheck.nameOf(v));
        }

        else if(count == 3) {
            Name5.add(networkcheck.nameOf(v));
            //System.out.println(networkcheck.nameOf(v));
        }

        else if(count == 4) {
            Name6.add(networkcheck.nameOf(v));
        }



        //System.out.print(v + " ");
        marked[v] = true;
        id[v] = count;
        size[count]++;
        for (int w : G.adj(v)) {
            if (!marked[w]) {
                dfs(G, w);
            }
        }
    }

    public void populationofeachisland() {

        int total = 0;

        //System.out.print(citylist);

        for(int i = 0; i < Name2.size()-1; i++) {

            sum+=numbers.get(i);
            //System.out.println(numbers.get(i));
        }

        if(Name3.size() > 0) {
            for(int i = 0; i < Name3.size(); i++) {
                if(popmap2.containsKey(Name3.get(i))) {
                    sum2 += popmap2.get(Name3.get(i));
                    total = sum2;
                }
            }
        }

        if(Name4.size() > 0) {
            for(int i = 0; i < Name4.size(); i++) {
                if(popmap2.containsKey(Name4.get(i))) {
                    sum3 += popmap2.get(Name4.get(i));
                }
            }
        }

        if(Name5.size() > 0) {
            for(int i = 0; i < Name5.size(); i++) {
                if(popmap2.containsKey(Name5.get(i))) {
                    sum4 += popmap2.get(Name5.get(i));
                }
            }
        }

        if(Name6.size() > 0) {
            for(int i = 0; i < Name6.size(); i++) {
                if(popmap2.containsKey(Name6.get(i))) {
                    sum5 += popmap2.get(Name6.get(i));
                }
            }
        }







        System.out.print("island 1 " + sum + " island 2 " + total + " island 3 " + sum3 + " island 4 " + sum4 + " island 5 " + sum5);

    }




    //return the component id of the connected vertex.
    public int id(int v) {
        validateVertex(v);
        return id[v];
    }


    //returns the number of vertices in the connected components.
    public int size(int v) {
        validateVertex(v);
        return size[id[v]];
    }


    //returns the number of connected components in the graph.
    public int count() {
        citylist2.removeAll(Arrays.asList(null, ""));
        countislands = citylist2.size();

        return countislands;
    }


    //returns true if the vertices are in the same connected component
    public boolean connected(int v, int w) {
        validateVertex(v);
        validateVertex(w);
        return id(v) == id(w);
    }


    // throw an IllegalArgumentException unless {0 <= v < V}
    private void validateVertex(int v) {
        int V = marked.length;
        if (v < 0 || v >= V)
            throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (V-1));
    }

}

