import java.util.EmptyStackException;

//Generic in order to allow the acceptances of Characters and Integers for array stack
public class Stack<E> {

    private int [] s; //Holds the stack elements
    private int top;  //top pointer of the stack

    //Used stack array for simplicity, am aware that it can slow-down on runtime if I do not use linked lists stack because it does not grow and shrink at needs.
    //However linkedlist stacks do require more memory because of pointers, and cannot randomly access.
    public Stack(int capacity) {
        s = new int[capacity];
        top = 0;
    }

    // empty method checks for an empty stack
    //returns true if the stack is empty

    public boolean empty() {

        return top == 0;

    }

    // push method puts the value at the top of the stack

    public void push (int x) {

        if(top == s.length)
            throw new StackOverflowError();

        else {

            s[top] = x;
            top++;

        }

    }

    // pop method, pops a value off the stack.
    //returns the value that is popped.
    //EmptystackException when the stack is empty

    public int pop() {

        if (empty()) {
            throw new EmptyStackException();
        }

        else {

            top--;
            return s[top];

        }

    }

    //peek method returns the latest value at the top of the stack.

    int peek() {

        if(empty())
            throw new EmptyStackException();

        else {

            return s[top-1];

        }

    }

    //returns the size of the stack

    public int size() {
        return top;
    }


}
