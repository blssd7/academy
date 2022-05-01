package classwork;

public class LinkedListCustom<T> {
	

	private Node nead;
	private Node tail;
	private int size = 0;
	
	public void add(T value) {
		Node newNode = new Node(value);
	
	if (head == null 0) {
		tail = newNode;
		head = newNode;
		
	}else {
		tail.next = newNode;
		newNode.pref =tail;
		tail = newNode}
	size++;
	}
	
		
	}
	
}
}
