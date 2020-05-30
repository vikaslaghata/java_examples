import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Java program for different tree traversals 

/* Class containing left and right child of current 
node and key value*/
class Node 
{ 
	int value; 
	Node left, right; 

	public Node(int value) 
	{ 
		this.value = value; 
		left = right = null; 
	}
} 

class BinaryTree 
{ 
	// Root of Binary Tree 
	Node root;

	/* Given a binary tree, print its nodes according to the 
	"bottom-up" postorder traversal. */
	/* 1. Traverse the left subtree, i.e., call Postorder(left-subtree)
	   2. Traverse the right subtree, i.e., call Postorder(right-subtree)
	   3. Visit the root.
	   */
	void printPostorder(Node node) 
	{ 
		if (node == null) 
			return; 

		// first recur on left subtree 
		printPostorder(node.left); 

		// then recur on right subtree 
		printPostorder(node.right); 

		// now deal with the node 
		System.out.print(node.value + " "); 
	} 

	/* Given a binary tree, print its nodes in inorder*/
	/* 1. Traverse the left subtree, i.e., call Inorder(left-subtree)
	   2. Visit the root.
	   3. Traverse the right subtree, i.e., call Inorder(right-subtree)
	   */
	void printInorder(Node node) 
	{ 
		if (node == null) 
			return; 

		/* first recur on left child */
		printInorder(node.left); 

		/* then print the data of node */
		System.out.print(node.value + " "); 

		/* now recur on right child */
		printInorder(node.right); 
	} 

	/* Given a binary tree, print its nodes in preorder*/
	/*1. Visit the root.
	   2. Traverse the left subtree, i.e., call Preorder(left-subtree)
	   3. Traverse the right subtree, i.e., call Preorder(right-subtree) 
	   */
	void printPreorder(Node node) 
	{ 
		if (node == null) 
			return; 

		/* first print data of node */
		System.out.print(node.value + " "); 

		/* then recur on left subtree */
		printPreorder(node.left); 

		/* now recur on right subtree */
		printPreorder(node.right);

		List<List<String>> namesNested = Arrays.asList(
				Arrays.asList("Jeff", "Bezos"),
				Arrays.asList("Bill", "Gates"),
				Arrays.asList("Mark", "Zuckerberg"));

		List<String> namesFlatStream = namesNested.stream()
				.flatMap(Collection::stream)
				.collect(Collectors.toList());

	} 

	// Wrappers over above recursive functions 
	void printPostorder() {	 printPostorder(root); } 
	void printInorder() {	 printInorder(root); } 
	void printPreorder() {	 printPreorder(root); }
	

	private Node addRecursive(Node current, int value) {
	    if (current == null) {
	        return new Node(value);
	    }
	 
	    if (value < current.value) {
	        current.left = addRecursive(current.left, value);
	    } else if (value > current.value) {
	        current.right = addRecursive(current.right, value);
	    } else {
	        // value already exists
	        return current;
	    }
	 
	    return current;
	}
	
	Node add(int value) {return addRecursive(root,value);}

	// Driver method 
	public static void main(String[] args) 
	{ 
		BinaryTree tree = new BinaryTree(); 
		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5); 
		
		/*tree.root = tree.add(1); // If you want to make it binary tree.
		tree.add(1);
		tree.add(2);
		tree.add(3);
		tree.add(4);
		tree.add(5);*/		

		System.out.println("Preorder traversal of binary tree is "); 
		tree.printPreorder(); 

		System.out.println("\nInorder traversal of binary tree is "); 
		tree.printInorder(); 

		System.out.println("\nPostorder traversal of binary tree is "); 
		tree.printPostorder(); 
		
		
		//copy an array to another:-
		List<String> list=null;
		List<String> flowers = Optional.ofNullable(list)
				  .map(List::stream)
				  .orElseGet(Stream::empty)
				  .collect(Collectors.toList());
		//Optional.ofNullable(list).map(elem->list.stream()).orElseGet((Supplier<? extends Stream<String>>) Stream.empty()).;
		System.out.println(flowers);
	} 
}