class LinkedList { 
	Nodee head; 

	static class Nodee { 
		int data; 
		Nodee next;
		Nodee(int d) 
		{ 
			data = d; 
			next = null; 
		}
	} 

	public static void main(String[] args) 
	{ 
		
		LinkedList llist = new LinkedList(); 

		llist.head = new Nodee(1); 
		Nodee second = new Nodee(2); 
		Nodee third = new Nodee(3); 

		llist.head.next = second; 
               second.next = third;

		
	} 
} 
