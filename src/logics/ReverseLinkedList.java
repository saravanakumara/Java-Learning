package logics;

public class ReverseLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(35);
        head.next = new ListNode(15);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(20);
        ListNode node = reverseList(head);
        ListNode temp = node;
        while(temp != null) {
        	System.out.println(temp.val);
        	temp = temp.next;
        }

	}
	
	private static ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode tail = head;
		
		while(tail != null) {
			ListNode temp = tail.next;
			tail.next = prev;
			prev = tail;
			tail = temp;
		}
		
		return prev;
		
	}

}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}