package Linked_List;

public class Reverse_LinkedList {

	public static void main(String[] args) {
		
		Node n1=new Node(20);
		
		Node n2=new Node(30);
		
		Node n3=new Node(35);
		
		Node n4=new Node(50);
		
		n1.next=n2;
		
		n2.next=n3;
		
		n3.next=n4;
		
		Delete_element.print(n1);
		
		System.out.println();
		
		System.out.println(ReverseLinkedist(n1));
		
		
	}
	
	
	static Node ReverseLinkedist(Node head) {
		
		Node previous=null;
		
		Node current=head;
		
		while(current!=null) {
			
			Node temp=current.next;
			
			current.next=previous;
			
			previous=current;
			
			current=temp;
			
			
			
			
		}
		
		return previous;
		
		
		
		
		
		
	}

}
