package src;

public abstract class Node<T> {
	T val;
	T next;
	
	public Node(T val) {
		this.val = val;
		this.next = null;
	}
}
