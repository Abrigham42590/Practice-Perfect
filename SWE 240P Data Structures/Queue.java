public class Queue {

    private String[] q;
    private int front;
    private int rear;
    private int size;

    //creating a quene array, which is O(N) in runtime and space complexity vs quene Linked List but easier to implement. Quene Linked List is O(1).
    public Queue(int capacity) {
        q = new String [capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    public int capacity() {

        return q.length;

    }

    //The enqueue method adds an element to the quene.

    public void enqueue(String s) throws QueueOverFlowException {

        if(size == q.length)
            throw new QueueOverFlowException();

        else {

            size++;
            q[rear] = s;
            rear ++;
            if (rear == q.length)
                rear = 0;

        }

    }

    //poll method return the item at the front of the quene.

    public String poll() {

        if (empty())
            throw new EmptyQueneException();

        else
            return q[front];

    }

    //the dequene method removes and returns the element at the front of the quene.

    public String dequeue() {

        if(empty())
            throw new EmptyQueneException();

        else {
            size--;
            String value =  q[front];

            q[front] = null;

            front++;

            if(front == q.length)
                front = 0;

            return value;
        }

    }

    //them empty method checks to see if the quene is empty

    public boolean empty()
    {

        return size == 0;

    }

    //string builder to build out the string of the quene
    public String toString() {

        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("front = " + front + "; ");
        sBuilder.append("rear = " + rear + "\n");

        for(int k = 0; k < q.length; k++) {

            if(q[k] != null)
                sBuilder.append(k + " " + q[k]);
            else
                sBuilder.append(k + " ?");

            if(k != q.length - 1)
                sBuilder.append("\n");
        }

        return sBuilder.toString();
    }




    //returns the size of the quene
    public int size() {

        return size;
    }


}
