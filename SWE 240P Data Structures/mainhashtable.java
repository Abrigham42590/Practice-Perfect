import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.io.BufferedReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;



@SuppressWarnings("unused")
public class mainhashtable {
    private static String words;
    private static String SortedString;
    private static String SortedString2;
    public static void main(String[] args) throws IOException {

        //Used a prime number for table size which helps to give best hash function value
        SeparateChainingHashST<String, String> map = new SeparateChainingHashST<String, String>(5);

        File file = new File("C:\\Coding Assignments\\pride-and-prejudice-1.txt");
        BufferedReader br1 = new BufferedReader(new FileReader(file));
        String read;

        //Created ArrayList for duplicate words.
        ArrayList<String> duplicates = new ArrayList<String>();
        Iterator<String> iterator = duplicates.iterator();
        StringBuilder string = new StringBuilder();



        int i = 0;

        //loop of reading the file line by line
        while((read = br1.readLine()) != null) {

            i++;


            //splits each word and matches with any character that is not within the brackets.

            String[] splitting = read.split("[^a-zA-Z]");

            //convert string array to ArrayList in order to remove extra whitespace. Its more simple to do it this way. Place this in here as a test.
            //However you still dont need it really because the hashmap doesnt count the whitepspace anyway.


            for(String w: splitting) {

                words = w;
                //System.out.println(words);
                char tempArray[] = words.toLowerCase().toCharArray();
                Arrays.sort(tempArray);
                SortedString = new String(tempArray);


                map.insert(words, SortedString);






            }








            //stores words that repeat, and prevents repeated words from entering hashmap;



        }





        int total;
        total = map.size();
        System.out.print(total);










        if(br1 != null) {

            try {
                br1.close();
            }

            catch(Exception e) {

            };

        }




    }
}