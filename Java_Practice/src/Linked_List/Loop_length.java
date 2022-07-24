package Linked_List;

public class Loop_length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1=new Node(90);
		
		Node n2=new Node(20);
		
		Node n3=new Node(30);
		
		Node n4=new Node(10);
		
		Node n5=new Node(14);
		
		n1.next=n2;
		
		n2.next=n3;
		
		n3.next=n4;
		
		n4.next=n5;
		
		n5.next=n2;
		
		System.out.println(length(n1));

	}
	
	
	static int length(Node head) {
		
		Node slow=head;
		
		Node fast=head;
		
		int i=0;
		
		while(fast!=null||fast.next!=null) {
			
			if(fast==slow && fast!=head) {
				System.out.println("yes");
				System.out.println(fast.i);
				break;
			}
			
			slow=slow.next;
			
			fast=fast.next.next;
			
			
		}
		
		
		return 0;
		
	}

}
