package exercise;

public class MyLinkedList {
	int size;
	SingleNode head;
	
	//Initializes the MyLinkedList object.
	public MyLinkedList() {
		this.size=0;
		this.head=null;
	}
	
	//Get the value of the indexth node in the linked list. If the index is invalid, return -1.
	public int get(int index) {
		if (index<0 || index>=size) {
			return -1;
		}
		
		SingleNode temp = head;
		for (int i=0;i<index;i++) {
			temp = temp.next;
		}
		return temp.val;
	}
	
	//Add a node of value val before the first element of the linked list. 
	//After the insertion, the new node will be the first node of the linked list.
	public void addAtHead(int val) {
		SingleNode newNode = new SingleNode(val);
		if (head==null) {
			head=newNode;
		}
		else {
			newNode.next=head;
			head=newNode;
		}
		size++;
	}
	
	//Append a node of value val as the last element of the linked list.
	public void addAtTail(int val) {
		SingleNode newNode = new SingleNode(val);
		if (head==null) {
			head=newNode;
		}
		else {
			SingleNode temp = head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
		size++;
	}
	
	//Add a node of value val before the indexth node in the linked list. 
	//If index equals the length of the linked list, the node will be appended to the end of the linked list.
	//If index is greater than the length, the node will not be inserted.
	public void addAtIndex(int index, int val) {
		if (index<0||index>size) {
			return;
		}
		if (index==0) {
			addAtHead(val);
		}
		else if (index==size) {
			addAtTail(val);
		}
		else {
			SingleNode newNode = new SingleNode(val);
			SingleNode temp=head;
			for (int i=0;i<index-1;i++) {
				temp=temp.next;
			}
			newNode.next=temp.next;
			temp.next=newNode;
		}
		size++;
	}
	
	//Delete the indexth node in the linked list, if the index is valid.
	public void deleteAtIndex(int index) {
		if(index<0||index>size) {
			return;
		}
		if (index==0) {
			head=head.next;
		}
		else {
			SingleNode temp=head;
			for (int i=0;i<index-1;i++) {
				temp=temp.next;
			}
			temp.next=temp.next.next;
		}
		size--;
	}
}
