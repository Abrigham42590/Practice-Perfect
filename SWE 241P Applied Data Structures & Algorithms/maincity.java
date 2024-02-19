import java.io.IOException;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


@SuppressWarnings("unused")
public class maincity {
    public static HashMap<String, Integer> mapping;  // string -> index
    private static String[] keys;
    public static int v;
    public static int w;
    public static void main(String[] args) throws IOException {

        mapping = new HashMap<String, Integer>();


        File file = new File("C:\\Coding Assignments\\road_network2.txt");
        BufferedReader br1 = new BufferedReader(new FileReader(file));
        String read;

        //calls city as a network object.
        city network = new city();

        //calls graph as an island object. There are 925 vertices for main file. This has to be adjusted in order to make the program work.
        //925 for problem from professor and 10 for the letters.
        Graph island2 = new Graph(925);







        while((read = br1.readLine()) != null) {

            String[] splitting = read.split(" : ");


            for (int i = 0; i < splitting.length; i++) {
                if (!mapping.containsKey(splitting[i]))
                    mapping.put(splitting[i], mapping.size());
            }


            v = mapping.get(splitting[0]);
            for (int i = 0; i < splitting.length; i++) {
                w = mapping.get(splitting[i]);
            }

            island2.addEdge(v, w);





        }


        if(br1 != null) {

            try {
                br1.close();
            }

            catch(Exception e) {
                System.out.print("file error");

            };

        }
        //calls islands object to find connected components.
        ConnectedComponents islands = new ConnectedComponents(island2);

        //The location of each city is marked by a number starting from 0. You can find any name of a city by using the call below.
        //System.out.println(network.nameOf(5));

        //prints the graph, for letters there will be an extra number which is needed for extra space. The graph is correct.
        System.out.println(island2);

        //helps initiate call of islands
        int m = islands.count();

        //calls the number of islands.
        System.out.println(m + " island");

        //calls object in order to find the shortest path between the source and vertex.
        BreadthFirstSearch shortestpath = new BreadthFirstSearch(island2, 0);

        //finds the shortestpath.
        System.out.println(shortestpath.pathTo(5));
        //calculates the length of shortestdistance.
        shortestpath.pathdistance();

        //population of islands.
        islands.populationofisland();

        islands.populationofeachisland();




    }
}