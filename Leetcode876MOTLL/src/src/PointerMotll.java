package src;

public class PointerMotll {
	public static ListNode middleNode(ListNode head) {
		ListNode middle = head;
		ListNode end = head;
		
		while(end!=null&&end.next!=null) {
			middle=middle.next;
			end=end.next.next;
		}
		
		return middle;
	}

}
