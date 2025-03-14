package re_coding18;

public class Reverse_LinkedList {
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode reverseList(ListNode head) {// rec
		return rec(head, null);
	}

	public ListNode rec(ListNode curr, ListNode prev) {
		if (curr == null) {
			return prev;
		}
		ListNode temp = rec(curr.next, curr);
		curr.next = prev;
		return temp;
	}

	public ListNode reverse(ListNode head) { // iterative
		ListNode curr = head;
		ListNode prev = null;
		while (curr != null) {
			ListNode ahead = curr.next;
			curr.next = prev;
			prev = curr;
			curr = ahead;
		}
		return prev;
	}

}
