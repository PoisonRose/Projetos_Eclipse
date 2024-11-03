package src;

public class DoublyLinkedNode<T> extends Node<T> {
	
	T val;
	Node<T> next;
	Node<T> prev;
	
	public DoublyLinkedNode(T val) {
		super(val);
	}
}
