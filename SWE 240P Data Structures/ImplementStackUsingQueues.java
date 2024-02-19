

//implementing stack using queues which utilizes the LIFO concept for a quene instead of FIFO.
public class ImplementStackUsingQueues {

    //implmenting the two instances, fixed.
    Queue queue = new Queue(10);
    Queue queues2 = new Queue(10);

    int current_size;

    //pushes string element into quene.
    public void push(String x) throws QueueOverFlowException, EmptyQueneException, EmptyQueueException {

        queues2.enqueue(x);

        while (!queue.empty()) {

            //check this.
            queues2.enqueue(queue.poll());

            queue.dequeue();
        }

        //queues are transferring information between each other.
        Queue quenea = queue;

        queue = queues2;
        queues2 = quenea;

    }

    //removes the element from the first quene
    public void pop() throws EmptyQueneException, EmptyQueueException {

        if(queue.empty()) {
            throw new EmptyQueneException();
        }


        queue.dequeue();

    }

    //returns the latest value of the quene at the top of the quene
    public String peek() throws EmptyQueneException, EmptyQueueException {

        if(queue.empty()) {
            throw new EmptyQueneException();
        }

        return queue.poll();
    }


    //returns the size of the quene.
    public int size() {

        return queue.size();
    }


}
