package Linked_List;

public class Subtract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Node n1=new Node(1);
		
		Node n2=new Node(0);
		
		Node n3=new Node(0);
		
		Node n4=new Node(6);
		
		Node n5=new Node(5);
		
		n1.next=n2;
		
		n2.next=n3;
	
		n4.next=n5;
		
		System.out.println(subtract(n1,n4));

	}
	
	public static int subtract(Node head1,Node head2) {
		
		int num1=0;
		int num2=0;
		
		while(head1.next!=null) {
			
			num1=num1*10+head1.i;
			
			head1=head1.next;
			
		}
		
		num1=num1*10+head1.i;
		
		
		while(head2.next!=null) {
			
			num2=num2*10+head2.i;
			
			head2=head2.next;
			
		}
		
		num2=num2*10+head2.i;
		
		return Math.abs(num2-num1);
		
	}

}
