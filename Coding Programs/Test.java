public class Test {
	
	Node head; 
	
	static class Node{
		int data;
		Node next;
		Node (int d) {
			
			data = d;
			next = null;
			
		}
		
	}
	
	public void printList() {
		
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + "");
			temp = temp.next;
			
		}
	}
	
	
		
	
	
	public static void main(String[] args) {
		
		Test list = new Test();
		
		list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(10);
		Node fifth = new Node(11);
		
		list.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		list.printList();


		
		
	
	
		
		
	}
}
