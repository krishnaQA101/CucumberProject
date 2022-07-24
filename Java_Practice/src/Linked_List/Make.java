package Linked_List;

public class Make {

	public static void main(String[] args) {
		
		
		Node n1=new Node(10);
		
		Node n2=new Node(20);
		
		Node n3=new Node(30);
		
		Node n4=new Node(40);
		
		Node head=n1;
		
		head.next=n2;
		
		n2.next=n3;
		
		n3.next=n4;
		
	
		Make make=new Make();
//		make.insert(50, n1, 2);
//		Make make1=new Make();
//		make1.traverse(n1);
		System.out.println(make.length_Linkedlist(n1));
		System.out.println(make.length_Linkedlist_Recursive(n1, 1));
		
		}
	
	
	void traverse(Node head) {
		
		Node current=head;
		
		while(current.next!=null) {
			
			
			System.out.println(current.i);
			
			current=current.next;
			
			
			
		}
	}
	
	void insert(int data,Node head,int position) {
		
		Node new_Node=new Node(data);
		
		if(position==0) {
			
			new_Node.next=head;
			
			
		}
		
		else {
			for(int i=0;i<position-1;i++) {
				
				head=head.next;
			}
			
			Node x=head.next;
			new_Node.next=x;
			head.next=new_Node;
			
		}
		
		
		
	}
	
	int length_Linkedlist(Node head) {
		
		int k=1;
		
		while(head.next!=null) {
			k++;
			head=head.next;
			
		}
		
		return k;
	}
	
int length_Linkedlist_Recursive(Node head, int length) {
		
		if(head.next==null) {
			return length;
		}
		
		length++;
		head=head.next;
      return length_Linkedlist_Recursive(head,length);
}
}
