// Nov 5th quiz

// 1 recursion problem
// tracing a recursive
// primarily on swing
// Layout managers
// positional coordinates
// custom graphics
// timer
// EDTs


public class LinkedList {

	private Node head;
	private Node tail;
	
	public void add(String item) {
		
		Node newItem = new Node(item);
		
		// handles the case where the new item 
		// is the only thing in the list
		if (head == null) {
			head = newItem;
			tail = newItem;
			return;
		}
		
		tail.next = newItem;
		tail = newItem;
	}


	public void addAtIndex(String addMe, int targetIndex){
		addAtIndex(addMe, targetIndex, this.head, 0);
	}


	private void addAtIndex(String addMe, int targetIndex, Node curNode, int currentIndex){

		// while(cur != null)


		if(curNode == null){
			return;
		}

		if(targetIndex == 0){
			Node newNode = new Node(addMe);


			newNode.next = this.head;

			this.head = newNode;

			return;

		}

		// base case
		if(currentIndex == targetIndex - 1){
			Node newNode = new Node(addMe);


			newNode.next = curNode.next;

			curNode.next = newNode;

			return;
		}


		// currentNode
		// currentIndex

		addAtIndex(addMe, targetIndex, curNode.next, currentIndex + 1);
	}

	
	
	public void print() {
		Node current = head;
		while (current != null) {
			System.out.println(current.item);
			current = current.next;
		}
	}
	
	
	public String getPenultimate() {
	    // TODO fix me
	    return "Not Implemented";
	}


	public String getFirst() {
	    // TODO fix me
	    return "Not Implemented";
	}


	public String getLast() {
	    // TODO fix me
	    return "Not Implemented";
	}



	
	class Node {
		String item;
		Node next;
		
		public Node(String item) {
			this.item = item;
			this.next = null;
		}
	}
}
