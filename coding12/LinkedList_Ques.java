package coding12;

public class LinkedList_Ques {
	public class ListNode { // LeetCode 160 Intersection of 2 linkedList
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
		  }
		public class Solution {
		    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		    	ListNode A = headA;
		        ListNode B =headB;
		        while(A!=B){
		            if(A==null){
		                A= headB;
		            }else{
		                A=A.next;
		            }if(B==null){
		                B=headA;
		            }else {
		                B=B.next;
		            }
		        }return A;
		    }
		}

	public static void main(String[] args) {
		//LeetCode 21 Merge two sorted linkedList
		// LeetCode 148 sort linkedList
	}

}
