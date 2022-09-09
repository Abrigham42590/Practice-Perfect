public class LinkedListQuene<T> {

	private class Node<T> {
		
		String value;
		Node<T> next;
		Node(String names, Node<T> n)
		{
			value = names;
			next = n;
		}
		
		
	}
	
	private class Node2<T> {
		
		String value2;
		Node2<T> next2;
		Node2(String numbers, Node2<T> n2) {
			
			value2 = numbers;
			next2 = n2;
		}
	}
	
	private Node2<T> front2 = null;
	private Node2<T> rear2 = null;
	
	
		
	
	private Node<T> front = null;
	private Node<T> rear = null;

	


public void enquene(String names) {
	
	if (rear != null) {
		
		rear.next = new Node<T>(names, null);
		rear = rear.next;
		
	}
	
	else {
		rear = new Node<T>(names, null);
		front = rear;
		
	}
	
}

public void enquene2(String numbers) {
	
	if(rear2 != null) {
		rear2.next2 = new Node2<T>(numbers, null);
		rear2 = rear2.next2;
	}
	
	else {
		rear2 = new Node2<T>(numbers, null);
		front2 = rear2;
	}
}


public boolean empty()
{
	return front == null;
}

public boolean empty2() {
	return front2 == null;
}


public String peek() throws EmptyQueneException {
	
	if (empty())
		throw new EmptyQueneException();
	else
		return front.value;
	
}

public String peek2() throws EmptyQueneException {
	
	if(empty2())
		throw new EmptyQueneException();
	else
		return front2.value2;
	
}


public String dequene() throws EmptyQueneException {
	
	
	if (empty()) {
		throw new EmptyQueneException();
	}
	else
	{
		String value = front.value;
		front = front.next;
		if (front == null) rear = null;
		return value;
	}
	
}

public String dequene2() throws EmptyQueneException2 {
	
	
	if(empty2()) {
		throw new EmptyQueneException2();
	}
	else
	{
		String value = front2.value2;
		front2 = front2.next2;
		if (front2 == null) rear2 = null; 
		return value;
	}
	
}

public String toString() {
	
	StringBuilder sBuilder = new StringBuilder();
	
	Node<T> p = front;
	Node2<T> p2 = front2;
	
	while (p != null) {
		
		sBuilder.append("Employee Name: " + p.value + " - Hourly Wage: $" + p2.value2 + "\n");
		p = p.next;
		p2 = p2.next2;
		
	}
	
	return sBuilder.toString();
	
}


}
