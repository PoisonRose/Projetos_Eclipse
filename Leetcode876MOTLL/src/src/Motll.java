package src;

import java.util.ArrayList;

public class Motll {
	public static ListNode middleNode(ListNode head) {
		ArrayList<ListNode> array = new ArrayList<>();
		
		int length = 0;
		while (head!=null) {
			array.add(head);
			head = head.next;
			length++;
		}
		
		return array.get(length/2);
	}
}
