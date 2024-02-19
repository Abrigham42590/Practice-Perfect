import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SequentialSearchST<Key, Value> {
    private int n;           // number of key-value pairs
    private Node first;      // the linked list of key-value pairs
    ArrayList<String> duplicates = new ArrayList<String>();

    // a helper linked list data type
    private class Node {
        private String key;
        private String val;
        private Node next;

        public Node(String key, String val, Node next)  {
            this.key  = key;
            this.val  = val;
            this.next = next;
        }
    }


    public SequentialSearchST() {
    }


    //returns the number of keyvalue pairs.
    public int size() {
        return n;
    }


    //returns true if the symbol table is empty.
    public boolean isEmpty() {
        return size() == 0;
    }


    //returns true if the table contains a specific key.
    public boolean contains(String key) {
        if (key == null) throw new IllegalArgumentException("argument to contains() is null");
        return get(key) != null;
    }



    //returns the value associated with a specific key
    public String get(String key) {
        if (key == null) throw new IllegalArgumentException("argument to get() is null");
        for (Node x = first; x != null; x = x.next) {
            if (key.equals(x.key))
                return x.val;
        }
        return null;
    }

    //insert the value with the specified key. Deletes the value and its specified key if the value is null.
    public void insert(String key, String val) {
        if (key == null) throw new IllegalArgumentException("first argument to put() is null");
        if (val == null) {
            delete(key);
            return;
        }


        //prevent duplicate values with separate chaining
        if(!duplicates.contains(val)) {
            duplicates.add(val);

            //looping through each node to see if the key of that table is equal to the node of that same position
            //prevents duplicate keys and adds value at same key as a node if the hash code creates a duplicate key.

            for (Node x = first; x != null; x = x.next) {
                if (key.equals(x.key)) {



                    x.val = val;
                    return;
                }
            }

            //creates the extra node when necessary.
            first = new Node(key, val, first);
            n++;
        }


    }


    //deletes the key and its specified value.
    public void delete(String key) {
        if (key == null) throw new IllegalArgumentException("argument to delete() is null");
        first = delete(first, key);
    }

    // delete key in linked list beginning at Node x
    // warning: function call stack too large if table is large
    private Node delete(Node x, String key) {
        if (x == null) return null;
        if (key.equals(x.key)) {
            n--;
            return x.next;
        }
        x.next = delete(x.next, key);
        return x;
    }


    //returns all the keys in the table
    public Iterable<String> keys()  {
        Queue<String> queue = new LinkedList<String>();
        for (Node x = first; x != null; x = x.next)
            queue.add(x.key);
        return queue;
    }
}
