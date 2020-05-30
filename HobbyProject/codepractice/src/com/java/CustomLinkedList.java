
public class CustomLinkedList {
	
	Node head;

	public static void main(String[] args) {
		CustomLinkedList list = new CustomLinkedList();
		list.add("elem1");
		list.add("elem2");
		list.add("elem3");
		
		list.printAll();
		
		
		
		list.delete("elem2");
		list.printAll();
		
		//System.out.println(list.size());
		
		System.out.println(list.getMiddleElem());

	}

	private String getMiddleElem() {
		//finding middle element of LinkedList in single pass
	      Node current = head;
	      int length = 0;
	      Node middle = head;
	    
	      while(current.previous != null){
	          length++;
	          if(length%2 ==0){
	              middle = middle.previous;
	          }
	          current = current.previous;
	      }
	    
	      if(length%2 == 1){
	          middle = middle.previous;
	      }
	      
	      return middle.value;
	//Read more: https://javarevisited.blogspot.com/2012/12/how-to-find-middle-element-of-linked-list-one-pass.html#ixzz6L5xh67Tn
		
	}

	private int size() {
		
		return 0;
	}

	private void delete(String elem) { //tOOD: pending to finish
		Node current = head;
		Node previous;
		while(current!=null) {
			previous = current;
			if(elem.equals(current.value)) {
				System.out.println("deleting element current "+current.value+" and previous= "+previous.value);
				previous.previous = current.previous;
				
				
			}			
			current = current.previous;
		}
		
	}

	private void add(String value) {
		if(head == null) {
			head = new Node();
			head.value = value;
		}else {
			Node newNode = new Node();
			newNode.value = value;
			newNode.previous = head;
			head = newNode;
		}		
		
	}
	private void printAll() {
		Node current = head;
		while(current!=null) {
			System.out.println("Node value= "+current.value);
			current = current.previous;
		}
	}
	
	class Node{
		public String value;
		public Node previous;
	}
}


