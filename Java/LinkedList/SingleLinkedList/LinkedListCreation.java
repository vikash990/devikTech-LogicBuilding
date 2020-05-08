class LinkedList { 
	Node head;  

	
	static class Node { 
		int data; 

		Node next; 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 

     public int printList(int key) 
	{ 
		Node n = head; 
		while (n != null) { 
                   if(n.data==key){
                     return key;  
                     } 
			n = n.next; 
		} 
  return 0;
	} 

	
	public static void main(String[] args) 
	{ 
		
		LinkedList llist = new LinkedList(); 

		llist.head = new Node(1); 
		Node second = new Node(2); 
		Node third = new Node(3); 
               Node forth =new Node(4);

		llist.head.next = second; 
		second.next = third; 
                third.next=forth;

           int y=llist.printList(6);

          System.out.println(y);
		
	} 
} 
