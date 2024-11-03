package src;

public class SinglyLinkedNode<T> extends Node<T> {
	
	T val;
	Node<T> next;
	
	public SinglyLinkedNode(T val) {
		super(val);
		this.val=val;
		this.next=null;
	}
}
