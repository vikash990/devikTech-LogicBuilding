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
 
      public int printList(int d) 
	{ 
		Nodee n = head; 
		while (n != null) { 
			if (n.data==d){
               return n.data;
           }
			n = n.next; 
		} 
       return -1;
	} 

	public static void main(String[] args) 
	{ 
		
		LinkedList llist = new LinkedList(); 

		llist.head = new Nodee(1); 
		Nodee second = new Nodee(2); 
		Nodee third = new Nodee(3); 

		llist.head.next = second; 
               second.next = third;
            
      System.out.println(llist.printList(4)); 
    

		
	} 
} 
