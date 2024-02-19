

public class mainstack {
    public static void main(String[] args) throws InvalidCharacterException {

        String infixExpression = "(50 * 80)";
        mainstack obj = new mainstack();
        System.out.println(obj.evaluate(infixExpression));

    }

    public int evaluate(String exp) throws InvalidCharacterException
    {
        Stack<Integer> operands = new Stack<Integer>(10);  //Operand stack
        Stack<Character> operations = new Stack<Character>(10);  //Operator stack



        for(int i=0; i<exp.length();i++) //running a loop through the given string
        {
            char c = exp.charAt(i); //returning the character
            if(Character.isLetter(c)) {
                throw new InvalidCharacterException();
            }
            if(Character.isDigit(c))   //check if it is a number or digit
            {

                int num = 0;
                while (Character.isDigit(c)) // Determines if the character is a digit, if so then it begins loop
                {
                    num = num*10 + (c-'0'); // c - '0', it returns an integer of c
                    i++;
                    if(i < exp.length()) //if loop variable is less than string length
                    {
                        c = exp.charAt(i); //returning character and putting the value in c
                    }
                    else
                    {
                        break; //if nothing the loop ends
                    }
                }
                i--;
                operands.push(num); //pushes integer into the operand stack
            }
            else if(c=='(') //in case c is an open bracket. This is for GEMDAS.
            {
                operations.push(c);   //push character to operators stack
            }
            //Closed brace
            else if(c==')')
            {
                while(operations.peek()!='(') //ignores left parenthesis
                {
                    int output = performOperation(operands, operations); //initiates the arithmetic operators in this method
                    operands.push(output);   //push result back to operands stack
                }
                operations.pop(); //removes operators from stack after value has been pushed to operands
            }


            else if(isOperator(c)) //checks to see if the character is an operator
            {
                while(!operations.empty() && operatororder(c)<=operatororder((char) operations.peek())) //loops if we are given two different operators and performs order of operations
                {
                    int output = performOperation(operands, operations);
                    operands.push(output);   //push result back to operands stack
                }


                operations.push(c);   //push the current operator to operations stack
            }


        }

        while(!operations.empty())
        {
            int output = performOperation(operands, operations);
            operands.push(output);   //push final result back to operands stack
        }
        return operands.pop(); //removes the result from the operands stack and returns value
    }

    static int operatororder(char c)
    {
        switch (c)
        {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;

            case '^':
            case '%':
                return 3;
        }
        return -1;
    }

    public int performOperation(Stack<Integer> operands, Stack<Character> operations) //performs the operation between the operator or operand
    {
        int a = operands.pop();
        int b = operands.pop();
        char operation = (char) operations.pop();
        switch (operation)
        {
            case '+':
                return a + b;
            case '-':
                return b - a;
            case '^':
                return (int) Math.pow(b, a);
            case '*':
                return a * b;
            case '%':
                return b % a;
            case '/':
                if (a == 0)
                {
                    System.out.println("Cannot divide by zero");
                    return 0;
                }
                return b / a;
        }
        return 0;

    }

    public boolean isOperator(char c) //returns a true value if the character is an operator
    {

        return (c=='+'||c=='-'||c=='/'||c=='*' || c=='^' || c=='%');


    }




}