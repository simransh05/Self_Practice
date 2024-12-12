package coding12;

public class LinkedList_Questions {
	public class ListNode { // middle for the linkedList
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { 
		    	  this.val = val; 
		      }
		      ListNode(int val, ListNode next) { 
		    	  this.val = val; 
		    	  this.next = next; 
		     }
		  }
	class Solution {
	    public ListNode middleNode(ListNode head) {
	        if(head == null ||head.next==null){
	            return head;
	        }ListNode slow = head;
	        ListNode fast = head;
	        while(fast!=null && fast.next!=null){
	            slow=slow.next;
	            fast=fast.next.next;
	        }return slow;
	    }
	}
	// LeetCode 141 cycle in linkedList
	// LeetCode 206 reverse of a linkedList

}
