package Linked_List;

public class Delete_element {

	public static void main(String[] args) {
		
	   Node head=new Node(35);
	   
	   Node n2=new Node(45);
	   
	   Node n3=new Node(40);
	   
	   Node n4=new Node(55);
	   
	   head.next=n2;
	   
	   n2.next=n3;
	   
	   n3.next=n4;
	   
	   //insert(head,44,2);
	   deleteElement(head, 0);
	   print(head);
	
	}
	
	
	public static void print(Node head) {
		
	     while(head.next!=null) {
		   
			System.out.println(head.i);
			head=head.next;
		
		}	
	     
	     System.out.println(head.i);
	}
	
	
	static void insert(Node head,int data,int position) {
		
		Node add=new Node(data);
		
		if(position==0) {
			
			add.next=head;
			
			
		}
		
		
		else {
			
			for(int i=0;i<position-1;i++) {
				
				head=head.next;
				
			}
			
			Node x=head.next;
			head.next=add;
			add.next=x;
			
			
			
		}
		
		
	}
	
	
	static void deleteElement(Node head,int position) {
		
		if(position==0) {
			
			head=head.next;
			return;
			
		}
		
		for(int i=0;i<position-1;i++) {
			
			head=head.next;
			
		}
		
		
		head.next=head.next.next;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
