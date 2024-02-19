public class mainqueue  {
    public static void main(String[] args) throws QueueOverFlowException, EmptyQueneException, EmptyQueueException {


        ImplementStackUsingQueues quene = new ImplementStackUsingQueues();


        quene.push("Paul");
        quene.push("Jordan");
        quene.push("Jack");

        quene.pop();
        //quene.peek();
        //quene.push("Bobby");
        //quene.push("rex");


        System.out.println(quene.peek());
        //System.out.print(quene.size());


    }
}