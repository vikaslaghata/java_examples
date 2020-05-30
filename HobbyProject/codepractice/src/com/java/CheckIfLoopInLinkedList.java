
public class CheckIfLoopInLinkedList {
	/*
	 * 1) Use two pointers fast and slow 2) Move fast two nodes and slow one node in
	 * each iteration 3) If fast and slow meet then linked list contains cycle 4) if
	 * fast points to null or fast.next points to null then linked list is not
	 * cyclic
	 */

	// Read more:
	// https://javarevisited.blogspot.com/2013/05/find-if-linked-list-contains-loops-cycle-cyclic-circular-check.html#ixzz6L6nzLQgU

	public static void main(String[] args) {
		//creating LinkedList with 5 elements including head
		/*
		LinkedList linkedList = new LinkedList(); 
		linkedList.appendIntoTail(new LinkedList.Node("101")); 
		LinkedList.Node cycle = new LinkedList.Node("201"); 
		linkedList.appendIntoTail(cycle); 
		linkedList.appendIntoTail(new LinkedList.Node("301")); 
		linkedList.appendIntoTail(new LinkedList.Node("401")); 
		linkedList.appendIntoTail(cycle);
		*/	

	}
/*
	public boolean isCyclic(){ 
			Node fast = head; 
			Node slow = head; 
			while(fast!= null && fast.next != null){
				fast = fast.next.next; 
				slow = slow.next; //if fast and slow pointers are meeting then LinkedList is cyclic 
				if(fast == slow ){
					return true; 
				} 
			} 
			return false; 
	} */

}
