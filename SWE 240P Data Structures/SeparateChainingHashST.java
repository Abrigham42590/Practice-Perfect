import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

public class SeparateChainingHashST<Key, Value> {
    private static final int INIT_CAPACITY = 4;

    private int n;                                // number of key-value pairs
    private int m;                                // hash table size
    private SequentialSearchST<String, String>[] st;  //array of linked-list symbol tables
    ArrayList<String> duplicates = new ArrayList<String>();


    public SeparateChainingHashST() {
        this(INIT_CAPACITY);
    }


    @SuppressWarnings("unchecked")
    public SeparateChainingHashST(int m) {
        this.m = m;
        st = (SequentialSearchST<String, String>[]) new SequentialSearchST[m];
        for (int i = 0; i < m; i++)
            st[i] = new SequentialSearchST<String, String>();
    }

    // resize the hash table to have the given number of chains,
    // rehashing all of the keys
    private void resize(int chains) {
        SeparateChainingHashST<String, String> temp = new SeparateChainingHashST<String, String>(chains);
        for (int i = 0; i < m; i++) {
            for (String key : st[i].keys()) {
                temp.insert(key, st[i].get(key));
            }
        }
        this.m  = temp.m;
        this.n  = temp.n;
        this.st = temp.st;
    }



    // hash function for keys - returns value between 0 and m-1 (assumes m is a power of 2)
    // (from Java 7 implementation, protects against poor quality hashCode() implementations)
    private int hash(String x) {
        int index;
        index = x.length() % st.length;

        return index;
    }


    //returns the size of the hashtable.
    public int size() {
        return n;
    }

    //returns true if the hashtable is empty.
    public boolean isEmpty() {
        return size() == 0;
    }


    //returns true if the hashtable contains a specific key. ]
    public boolean contains(String key) {
        if (key == null) throw new IllegalArgumentException("argument to contains() is null");
        return get(key) != null;
    }



    //returns the value associated with a specific key.
    public String get(String key) {
        if (key == null) throw new IllegalArgumentException("argument to get() is null");
        int i = hash(key);
        return st[i].get(key);
    }




    //insert a specific key and value associated with that key.
    public void insert(String key, String val) {

        if (key == null) throw new IllegalArgumentException("first argument to put() is null");
        if (val == null) {
            delete(key);
            return;
        }

        //to collect duplicates and prevent duplication

        if(!duplicates.contains(val)) {
            duplicates.add(val);


            // double table size if average length of list >= 10
            if (n >= 10*m) resize(2*m);

            int i = hash(key);
            if (!st[i].contains(key)) n++;
            st[i].insert(key, val);
        }


    }



    public void delete(String key) {
        if (key == null) throw new IllegalArgumentException("argument to delete() is null");

        int i = hash(key);
        if (st[i].contains(key)) n--;
        st[i].delete(key);

        // halve table size if average length of list <= 2
        if (m > INIT_CAPACITY && n <= 2*m) resize(m/2);
    }

    // return keys in symbol table as an Iterable
    public Iterable<String> keys() {
        Queue<String> queue = new LinkedList<String>();
        for (int i = 0; i < m; i++) {
            for (String key : st[i].keys())
                queue.add(key);
        }
        return queue;
    }


}