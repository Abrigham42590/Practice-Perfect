import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class sorting {

    public static void main(String[] args) {

        List<String> words = new ArrayList<String>();

        words.add("abd");
        words.add("dba");
        words.add("abc");
        words.add("cba");
        words.add("efg");

        //String word = "Jurassic";

        System.out.print(groupAnagram(words));

        //System.out.print(sortString(word));






    }

    @SuppressWarnings({ "unchecked", "rawtypes" })

    //GroupAnagram method to take in anagram strings and sort.
    public static List<List<String>> groupAnagram(List<String> strings) {
        HashMap<String, List<String>> mapping = new HashMap<>();
        List<List<String>> newvalues = new ArrayList();

        String[] stringarray = new String[strings.size()];
        stringarray = strings.toArray(stringarray);

        if(strings.size() == 0) {
            return new ArrayList();
        }

        //Takes a string then turns it into a character array, and is implemented into quicksort
        //algorithim.
        for(int i = 0; i < stringarray.length; i++) {

            char[] temparray = stringarray[i].toLowerCase().toCharArray();

            int templength = temparray.length;

            quicksort(temparray, 0, templength - 1);

            String s = String.valueOf(temparray);

            if(mapping.get(s) != null) {

                //mapping the new letters as keys and storing the characters list as values.
                List<String> a = mapping.get(s);
                a.add(stringarray[i]);
                mapping.put(s, a);


            }

            else {

                List<String> a = new ArrayList<>();
                a.add(stringarray[i]);
                mapping.put(s, a);

            }



        }

        //adds words in a list of a list bucket.
        for(Map.Entry<String, List<String>> en:mapping.entrySet()) {

            newvalues.add(en.getValue());

        }

        return newvalues;


    }
    //sorts any string into an anagram
    public static String sortString(String str) {

        char [] temparray = str.toLowerCase().toCharArray();

        int temp = temparray.length;

        quicksort(temparray, 0, temp - 1);

        String Sortedstring = new String(temparray);

        return Sortedstring;


    }

    //quicksort algorithim was chosen due to using arrays. Also quicksort is better for smaller arrays.
    //Mergesort was avoided due to it being more applicable for linked lists.
    //Heapsort was avoided due it being slower, however heapsort does have better memory usage than quicksort.
    //Radixsort is mainly used for number sorting because of how it works. Sorts everything digit
    //by digit, starting with least significant and then moving to most significant.
    //However it is faster than quicksort. Quicksort utilizes hardware caches better and radixsort
    //uses counting sort as a subroutine which takes up more space to move numbers.

    //partition method to choose an element from character array depending on positioning.
    //
    public static int partition(char[] letter, int low, int high) {

        int pivot = letter[low];
        int comparisonb = low - 1, comparisona = high + 1;

        //do while loop to repeat partition process of incremental counting in case a character is less than the pivot or greater.
        //Note that characters are compared based on their ASCII codes.
        while(true) {
            //comparisonb will continue to increment in case its less than pivot. In other words,
            //the algorithim will continue search through the element for lesser numbers.
            do {
                comparisonb++;

            } while(letter[comparisonb] < pivot);

            //given comparisona already starts high in the element range, if it finds a number greater than pivot,
            //then it will begin to decrement.
            do {
                comparisona--;
            } while(letter[comparisona] > pivot);

            //return comparisona to make the proper exchange between numbers.
            if(comparisonb >= comparisona)
                return comparisona;

            //numbers are exchanged in order to complete the sorting process.
            int temporary = letter[comparisonb];

            //numbers are successfully exchanged in order to complete the sort.
            letter[comparisonb] = letter[comparisona];
            letter[comparisona] = (char) temporary;
        }



    }

    //quicksort function that begins the recursive process. In other words, it repeats the partitioning
    //quicksort process until all elements have been sorted.
    public static void quicksort(char[] letter, int low, int high) {
        //if condition that initiates the recursion and calls the partition process to begin.
        if(low < high) {

            //the index position that partition that locates the number that will be
            //partitioned.
            int partioningindex = partition(letter, low, high);

            quicksort(letter, low, partioningindex);
            quicksort(letter, partioningindex + 1, high);
        }

    }


}
