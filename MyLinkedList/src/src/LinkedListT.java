package src;

public class LinkedListT<T> {
	//properties
	int size;
	Node<?> head;
	
	//Initializes the object.
	public LinkedListT() {
		this.size=0;
		this.head=null;
	}
	
	//Get the value of the indexth node in the linked list. If the index is invalid, return null.
	public T get(int index) {
		if (index<0 || index>size) {
			return null;
		}
		
		Node temp = head;
		for (int i=0;i<index;i++) {
			temp = temp.next;
		}
	}
}
